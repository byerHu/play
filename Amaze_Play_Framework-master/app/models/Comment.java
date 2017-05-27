package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;
import java.util.Date;

@Entity
public class Comment extends Model {
    @Id
    public int CommentId;
    
    public int commodityId;  
    public String user;
    public String content;
    public Date time;

    public Comment(int commodityId, String user,String content){
        this.commodityId = commodityId;
        this.user = user;
        this.content = content;
        this.time = new Date();
    }

    public static Finder<Integer,Comment> find =  new Finder<Integer,Comment>(Integer.class, Comment.class);
    
    public static List<Comment> findAll() {
        return find.all();
    }
    
    public static List<Comment> findById (int commodityId) {                //根据id返回评论
        return find.where().eq("commodityId", commodityId).findList();
    }
    
    public static List<Comment> findByUser (String username) {                //返回属于某个买家的所有评论
        return find.where().eq("user", username).findList();
    }
    
}
