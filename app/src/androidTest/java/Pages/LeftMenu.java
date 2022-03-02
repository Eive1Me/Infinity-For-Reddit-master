package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class LeftMenu extends Page
{
    public void clickAccount()
    {
        onView(allOf(withText("Press here to login"), isDisplayed()))
                .perform(click());
    }

    public void clickEva()
    {
        onView(allOf(withText("EvaPikaGirl"), isDisplayed()))
                .perform(click());
    }

    public void clickAnon()
    {
        onView(allOf(withText("Anonymous"), isDisplayed()))
                .perform(click());
    }

    public void clickSettings(){
        onView((allOf(withText("Settings"), isDisplayed()))).perform(click());
    }

}
