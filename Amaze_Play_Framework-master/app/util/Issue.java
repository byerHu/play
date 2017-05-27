package util;

import play.data.validation.Constraints.Required;

public class Issue {
    @Required
    public String title;
    @Required
    public String content;
}
