package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import org.mindrot.jbcrypt.BCrypt;

@Entity
public class User extends Model {
    @Id
    public int id;
    public String username;
    public String password;
    public int powerid;

    // Query
    
    public User(String username, String password,int powerid) {
        String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
        this.username = username;
        this.password = passwordHash;
        this.powerid = powerid;
    }
    
    public static Finder<Integer,User> find =  new Finder<Integer,User>(Integer.class, User.class);
    
    public static List<User> findAll() {
        return find.all();
    }
    
    public static User findByName (String username) {
        return find.where().eq("username", username).findUnique();
    }

    public static void delByName (String username) {
        User user = findByName(username);
        if(user != null)
            user.delete();
    }
    
    public static User authenticate(String username, String password) {
        User user =  find.where()
                .eq("username", username)
                .findUnique();
        if (user == null) {
            return user;
        } else if (BCrypt.checkpw(password, user.password)) {
            return user;
        } else {
            return null;
        }
    }
    
    public static boolean iscustomer(String username) {
        User user = findByName(username);
        return username!=null && user.powerid == 1;
    }
    
    public static boolean isseller(String username) {
        User user = findByName(username);
        return username!=null && user.powerid == 2;
    }
    
    public static boolean isadmin(String username) {
        User user = findByName(username);
        return username!=null && user.powerid == 3;
    }
    
    public static String current(String username) {
        if(username == null)
            return "登录";
        User user = findByName(username);
        String result="";
        switch(user.powerid){
            case 1: 
                result = user.username+"[会员]";
                break;
            case 2:
                result = user.username+"[商家]";
                break;
            case 3:
                result = user.username+"[管理员]";
                break;
            default:
                result = user.username+"[黑客]";
                break;
        }
        return result;
    }
}
