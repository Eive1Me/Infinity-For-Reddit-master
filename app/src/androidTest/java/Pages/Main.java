package Pages;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import org.junit.Assert;

import ml.docilealligator.infinityforreddit.R;

public class Main extends Page
{
    public void createPost()
    {
        onView(allOf(withId(R.id.fab_main_activity), isDisplayed()))
                .perform(click());
    }

    public void chooseText()
    {
        onView(allOf(withText("Текст"), isDisplayed()))
                .perform(click());
    }

    public void atPage(){
        //Assert.assertTrue();
    }
}
