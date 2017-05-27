package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import java.util.Date;

@Entity
public class Paper extends Model {
    @Id
    public int issueid;
    
    public String title;
    public String author;
    public String content;
    public Date time;
    
    public Paper(String title,String author,String content){
        this.title = title;
        this.author = author;
        this.content = content;
        this.time = new Date();
    }
    
    public static Finder<Integer,Paper> find =  new Finder<Integer,Paper>(Integer.class, Paper.class);
    
    public static List<Paper> findAll() {
        return find.all();
    }
    
    public static Paper findById (int issueid) {
        return find.ref(issueid);
    }
    
    public static List<Paper> findByName (String author) {
        return find.where().eq("author", author).findList();
    }
    
    public static void delById (int issueid) {
        find.ref(issueid).delete();
    }
    
    public static boolean isbelong (String username,int issueid) { 
        Paper paper = findById(issueid);
        return paper!=null && paper.author.equals(username);
    }

}
