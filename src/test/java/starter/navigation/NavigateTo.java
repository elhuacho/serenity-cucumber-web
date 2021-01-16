package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo  {

    public static Performable theApplitoolsHomePage() {
        return Task.where("{0} opens the Applitools home page",
                Open.browserOn().the(ApplitoolsHomePage.class)
        );
    }
    public static Performable aMissingPage() {
        return Task.where("{0} opens the Applitools home page",
                Open.browserOn().the(WrongPage.class)
        );
    }

}