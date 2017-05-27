package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import java.util.Date;
import java.util.Map;
import java.io.File;

@Entity
public class Commodity extends Model {
    @Id
    public int commodityId;
    
    public String commodityName;
    public double price;
    public double agio;
    public String cType;
    public String user;
    public Date time;
    
    public Commodity(String commodityName,double price,double agio,String cType,String user){
        this.commodityName = commodityName;
        this.price = price;
        this.agio = agio;
        this.cType = cType;
        this.user = user;
        this.time = new Date();
    }
    
    public static Finder<Integer,Commodity> find =  new Finder<Integer,Commodity>(Integer.class, Commodity.class);
    
    public static List<Commodity> findAll() {
        return find.all();
    }
    
    public static Commodity findById (int commodityId) {              //根据id返回商品
        return find.where().eq("commodityId", commodityId).findUnique();
    }
    
    public static List<Commodity> findByUser (String username) {                //返回属于某个商家的所有商品
        return find.where().eq("user", username).findList();
    }
    
    public static void delById (int commodityId,String filepath) {
        find.ref(commodityId).delete();
        
        File file = new File(filepath);  
        // 路径为文件且不为空则进行删除  
        if (file.isFile() && file.exists())
            file.delete();  
    }
    
    public static boolean isbelong (String username,int commodityId) {    //某个商品是否属于某个商家
        Commodity commodity = findById(commodityId);
        return commodity!=null && commodity.user.equals(username);
    }
    
    public static List<Commodity> findNew () {                //返回属于某个商家的所有商品
        return find.where().orderBy().desc("commodityId").setMaxRows(6).findList();
    }
    
    public static Commodity chageByMap (Map<String,String[]>  map,String username) {
        return new Commodity(map.get("commodityName")[0],Double.valueOf(map.get("price")[0]), Double.valueOf(map.get("agio")[0]),map.get("cType")[0],username);
    }
}
