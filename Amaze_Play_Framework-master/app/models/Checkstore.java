package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class Checkstore extends Model {
    @Id
    public int checkId;
    public String storename;

    public String user;
    public String description;
    public Checkstore(String storename,String user,String description){
        this.storename = storename;
        this.user = user;
        this.description = description;
    }
    
    public static Finder<Integer,Checkstore> find =  new Finder<Integer,Checkstore>(Integer.class, Checkstore.class);
    
    public static List<Checkstore> findAll() {
        return find.all();
    }
    
    public static void pass (int checkId) {             
        Checkstore check = find.ref(checkId);
        if(check != null){
            Store store = new Store(check.storename,check.user,check.description);
            store.save();
            check.delete();
        }
    }
    
    public static void delapply (int checkId) {
      Checkstore check = find.ref(checkId);
      if(check !=null)
        check.delete();
    }
}
