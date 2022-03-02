package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class ManageThemes extends Page{
    public void clickRed(){
        onView(allOf(withText("Red Dark"), isDisplayed()))
                .perform(click());
    }
}
