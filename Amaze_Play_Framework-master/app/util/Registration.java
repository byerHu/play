package util;

import play.data.validation.Constraints.Required;

public class Registration {
    @Required
    public String username;
    @Required
    public String password;
    @Required
    public boolean sellers;
}
