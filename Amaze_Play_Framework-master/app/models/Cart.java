package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Cart extends Model {
    @Id
    public int cartId;
    public int commodityId;
    public int number;
    public String user;

    public Cart(int commodityId,int number,String user){
        this.commodityId = commodityId;
        this.number = number;
        this.user = user;
    }
    
    public static Finder<Integer,Cart> find =  new Finder<Integer,Cart>(Integer.class, Cart.class);
    
    public static List<Cart> findByUser (String username) { 
        return find.where().eq("user", username).findList();
    }

    public static void buyAll(String username) {
        List<Cart> cart = findByUser(username);
        for (int i=0; i<cart.size(); i++) {
            Cart item = cart.get(i);
            Commodity commodity = Commodity.findById(item.commodityId);
            double money = commodity.price * commodity.agio * item.number;
            Bill bill = new Bill(item.commodityId,item.number,money,item.user);
            bill.save();
            item.delete();
        }
    }
    
    public static void delById(int commodityId,String username) {
        Cart cart = findByUser_Id(commodityId,username);
        if(cart !=null)
            cart.delete();
    }
    
    public static void addCart(int commodityId,int number,String username) {
        Cart cart = findByUser_Id(commodityId,username);
        if(cart !=null){
            cart.number=number;
            cart.save();
        }else{
            Cart new_cart = new Cart(commodityId,number,username);
            new_cart.save();
        }
            
    }

    public static Cart findByUser_Id(int commodityId,String username) {
        List<Cart> cart = findByUser(username);
        for (int i=0; i<cart.size(); i++) {
            Cart item = cart.get(i);
            if(item.commodityId == commodityId)
                return item;
        }
        return null;
    }

    public static List<Cart> findAll() {
        return find.all();
    }
    
    
 
}
