package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.action.ViewActions;

public abstract class Page
{
    public void moveToLeft()
    {
        onView(withId(android.R.id.content))
                .perform(ViewActions.swipeRight());
    }

    public void moveToUp()
    {
        onView(withId(android.R.id.content))
                .perform(ViewActions.swipeDown());
    }

    public void moveToRight()
    {
        onView(withId(android.R.id.content))
                .perform(ViewActions.swipeLeft());
    }

    public void moveToDown()
    {
        onView(withId(android.R.id.content))
                .perform(ViewActions.swipeUp());
    }
}
