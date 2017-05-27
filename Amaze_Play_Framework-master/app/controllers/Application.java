package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.*;
import util.*;

import play.data.Form;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import java.util.Map;

public class Application extends Controller {

    public static Result index() {                  //首页
        List<Commodity> commodity = Commodity.findNew();
        String current_user = User.current(session("user"));
        return ok(index.render(commodity,current_user));
    }
    
    public static Result register() {       //注册
        String current_user = User.current(session("user"));
        return ok(views.html.register.render(current_user));
    }

    public static Result postregister() {               //注册提交
        Form<Registration> userForm = Form.form(Registration.class).bindFromRequest();
        Registration registration = userForm.get();
        if(User.findByName(registration.username) != null)
            return ok("already registered"); 
        int powerid=1;
        if(registration.sellers)
            powerid = 2;
        User user = new User(registration.username, registration.password, powerid);
        user.save();
        return ok("success"); 
    }
    
    public static Result login() {                //登录页面
        String current_user = User.current(session("user"));
        return ok(views.html.login.render(current_user));
    }
    
    public static Result postlogin() {            //登录
        Form<Login> userForm = Form.form(Login.class).bindFromRequest();
        if (userForm.hasErrors()) {
            return ok("Wrong user/password");
        } else {
            session().clear();
            session("user",userForm.get().username);
            return ok("success");
        }
    }
    
    public static Result item(int id) {                     //返回商品页面
        if(id <1 || Commodity.findById(id)==null)
            return redirect("/");
        Commodity commodity = Commodity.findById(id);
        List<Comment> comment = Comment.findById(id);
        String current_user = User.current(session("user"));
        return ok(views.html.item.render(commodity,comment,current_user));
    }
    
    public static Result delitem(int id) {
        if(id >0 && User.isseller(session("user")) && Store.hasStore(session("user")) && Commodity.isbelong(session("user"),id)){      //删除制定商品 商家权限
            Commodity.delById(id,Play.application().path()+"/public/uploads/commodity_" + id);
            return redirect("/business");
        }
        return redirect("/login");
    }
    
    public static Result edititem(int id) {                               //有id返回修改 无id返回添加
        if(User.isseller(session("user")) && Store.hasStore(session("user"))){
            if(id < 1){
                return ok(views.html.additem.render());     
            }
            if(Commodity.isbelong(session("user"),id)){
                Commodity commodity = Commodity.findById(id);
                return ok(views.html.edititem.render(commodity));
            }
        }
        return ok("你没有商店");
    }
    
    public static Result postitem() {                 //添加商品
        MultipartFormData body = request().body().asMultipartFormData();
        Map<String,String[]>  map = body.asFormUrlEncoded();
        try{
            Commodity commodity = Commodity.chageByMap(map,session("user"));
            commodity.save();
            FilePart picture = body.getFile("picture");
            if (picture != null) {
                String contentType = picture.getContentType(); 
                File file   = picture.getFile();
                File root = Play.application().path();
                file.renameTo(new File(root, "/public/uploads/commodity_" + commodity.commodityId));
            }
            return redirect("/business");
        }catch(Exception e){
            //log 输入参数不规范
            return ok("参数不规范");
        }

    }
    
    public static Result postedititem(int id) {                    //修改商品
        MultipartFormData body = request().body().asMultipartFormData();
        Commodity keymap = Commodity.chageByMap(body.asFormUrlEncoded(),"");
        if(User.isseller(session("user")) && Commodity.isbelong(session("user"),id)){ 
            Commodity commodity = Commodity.findById(id);
            commodity.commodityName = keymap.commodityName;
            commodity.price = keymap.price;
            commodity.agio = keymap.agio;
            commodity.cType = keymap.cType;
            commodity.save();
            
            FilePart picture = body.getFile("picture");
            if (picture != null) {
                String contentType = picture.getContentType(); 
                File file   = picture.getFile();
                File root = Play.application().path();
                file.renameTo(new File(root, "/public/uploads/commodity_" + id));
            }
            return redirect("/business");
        }
        return redirect("/login");
    }
    
    public static Result issue() {                           //获取全部帖子
        List<Paper> papers = Paper.findAll();
        String current_user = User.current(session("user"));
        return ok(views.html.issue.render(papers,current_user));
    }
    
    public static Result editissue() {                           //发帖子
        if(!User.isseller(session("user")) && !User.isadmin(session("user")) && !User.iscustomer(session("user")))
            return redirect("/login");
        String current_user = User.current(session("user"));
        return ok(views.html.editissue.render(current_user));
    }
  
    public static Result postissue() {                        //发表帖子
        if(!User.isseller(session("user")) && !User.isadmin(session("user")) && !User.iscustomer(session("user")))
            return redirect("/login");
        Form<Issue> userForm = Form.form(Issue.class).bindFromRequest();
        Issue issue = userForm.get();
        Paper paper= new Paper(issue.title,session("user"),issue.content);
        paper.save();
        return ok("发表文章成功");
    }
    
    public static Result business() {               //如果没有商店，则返回开店请求，有商店返回商店
        if(User.isseller(session("user"))){ 
            if (Store.hasStore(session("user"))){
                List<Commodity> commodity = Commodity.findByUser(session("user"));
                return ok(manage.render(commodity));
            }
            else{
                String current_user = User.current(session("user"));
                return ok(applyStore.render(current_user));
            }
        }
        return ok("你不是商家");
    }
    
    public static Result postbusiness() {               //提交开店请求
        if(!User.isseller(session("user")) || Store.hasStore(session("user")))     //不是商家或者开了店 重定向
            redirect("/login");
        Form<Request> userForm = Form.form(Request.class).bindFromRequest();
        Request request = userForm.get();
        Checkstore checkstore  = new Checkstore(request.storename, session("user"),request.description);
        checkstore.save();
        return ok("开店请求代审核");
    }
    
    public static Result pass(int id) {                //管理员方法 商家审核通过
        if(User.isadmin(session("user"))){
            Checkstore.pass(id);
            return redirect("/admin");
        }
        return redirect("/login");
    }
    
    public static Result postdiscuss() {                  //发表评论
        Form<Discuss> userForm = Form.form(Discuss.class).bindFromRequest();
        Discuss discuss = userForm.get();
        if(!discuss.content.equals("") && User.iscustomer(session("user")) && Bill.hasBuy(discuss.commodityId,session("user")) || User.isadmin(session("user"))){          //判断是不是买家和买过商品 用实体Bill实体类     
            Comment comment  = new Comment(discuss.commodityId, session("user"),discuss.content);
            comment.save();
            return ok("success");
        }
        return ok("faild");
    }
    
    public static Result addcart(int id,int num) {
        if(!User.iscustomer(session("user")))              //不是顾客或没登录
            return redirect("/login");
        Cart.addCart(id, num, session("user"));
        return ok("success");
    }
    
    public static Result cart() {                           //获取购物车里的商品
        if(!User.iscustomer(session("user")))              //不是顾客或没登录
            return redirect("/login");
        List<Cart> cart = Cart.findByUser(session("user"));
        List<Commodity> commoditys = new ArrayList<Commodity>();
        double money = 0;
        for (int i=0; i<cart.size(); i++) {
            Cart item = cart.get(i);
            Commodity commodity = Commodity.findById(item.commodityId);
            commoditys.add(commodity);
            money += commodity.price * commodity.agio * item.number;
        }
        String current_user = User.current(session("user"));
        return ok(views.html.cart.render(cart,commoditys,money,current_user));
    }
    
    public static Result delcart(int id) {                           //删除购物车特定商品
        if(!User.iscustomer(session("user")))              //不是顾客或没登录
            return redirect("/login");
        Cart.delById(id,session("user"));
        return ok("删除商品成功");
    }
    
    public static Result admin() {                           //管理员界面
        if(!User.isadmin(session("user")))        
            return redirect("/login");
        List<User> user= User.findAll();                          //所有用户
        List<Checkstore> checkstore = Checkstore.findAll();               //所有开店请求
        List<Store> store = Store.findAll();                        //所有商店
        return ok(views.html.admin.render(user, store, checkstore));
    }


    public static Result buy() {                           //购买
        if(!User.iscustomer(session("user")))              //不是顾客或没登录
            return redirect("/login");
        Cart.buyAll(session("user"));
        return ok("购买成功");
    }
    
    public static Result deluser(String username) {                           //删除用户
        if(!User.isadmin(session("user")))        
             return redirect("/login");
        User.delByName(username);
        return redirect("/admin");
    }
    
    public static Result delapply(int id) {                     //删除开店申请  管理员权限
        if(User.isadmin(session("user"))){
            Checkstore.delapply(id);
            return redirect("/admin");
        }
        return redirect("/login");
   }
}
