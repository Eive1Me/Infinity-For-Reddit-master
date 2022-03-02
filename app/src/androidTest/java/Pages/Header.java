package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.Matchers.allOf;

public class Header extends Page
{
    public void clickHamburger()
    {
        onView(allOf(withContentDescription("Open navigation drawer"), isDisplayed()))
                .perform(click());
    }

    public void clickMore()
    {
        onView(allOf(withContentDescription("Другие параметры"), isDisplayed()))
                .perform(click());
    }
}
