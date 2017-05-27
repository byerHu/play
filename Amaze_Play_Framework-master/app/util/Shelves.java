package util;

import play.data.validation.Constraints.Required;

public class Shelves {
    public int commodityId;
    @Required
    public String commodityName;
    @Required
    public double price;
    @Required
    public double agio;
    @Required
    public String cType;
}
