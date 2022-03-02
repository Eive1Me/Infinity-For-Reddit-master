package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class Theme extends Page{
    public void clickManageTheme(){
        onView(allOf(withText("Manage Themes"), isDisplayed()))
                .perform(click());
    }
}
