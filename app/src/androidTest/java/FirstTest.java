
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import java.util.Collection;

import Pages.Header;
import Pages.LeftMenu;
import Pages.Main;
import Pages.ManageThemes;
import Pages.Red;
import Pages.Settings;
import Pages.Theme;
import ml.docilealligator.infinityforreddit.activities.MainActivity;

@RunWith(AndroidJUnit4.class)
public class FirstTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule
            = new ActivityScenarioRule<>(MainActivity.class);

    Header header = new Header();
    LeftMenu leftMenu = new LeftMenu();
    Main main = new Main();
    Settings settings = new Settings();
    Theme theme = new Theme();
    ManageThemes manageThemes = new ManageThemes();
    Red red = new Red();

    @Test
    public void accountLogin() {
        header.clickHamburger();
        leftMenu.clickAccount();
        leftMenu.clickEva();
        header.clickHamburger();
        leftMenu.clickEva();
        leftMenu.clickAnon();
        main.atPage();

    }

    @Test
    public void customTheme()
    {
        header.clickHamburger();
        leftMenu.clickSettings();
        settings.clickTheme();
        theme.clickManageTheme();
        manageThemes.clickRed();
        red.clickOk();
    }

}