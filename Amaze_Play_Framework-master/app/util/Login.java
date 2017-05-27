package util;

import play.data.validation.Constraints.Required;
import models.User;
public class Login {
    @Required
    public String username;
    @Required
    public String password;
    
    public String validate() {
        if (User.authenticate(username, password) == null) {
            return "Invalid user or password";
        } 
        return null;
    }
}
