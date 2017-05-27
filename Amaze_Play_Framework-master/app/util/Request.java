package util;

import play.data.validation.Constraints.Required;

public class Request {
    @Required
    public String storename;
    @Required
    public String description;
}
