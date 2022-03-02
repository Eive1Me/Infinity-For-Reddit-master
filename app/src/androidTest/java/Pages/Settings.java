package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class Settings extends Page{

    public void clickTheme(){
        onView(allOf(withText("Theme"), isDisplayed()))
                .perform(click());
    }

}
