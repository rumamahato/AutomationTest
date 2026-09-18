package TestCase;

import BasicClass.Basic;
import Pages.LoginPage;
import Utilities.CustomerTestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomerTestListener.class)
public class LoginPage_TestCase extends Basic {

    @Test
    public void validLoginTest() {

        // Login Page
        LoginPage loginPage = new LoginPage(driver);

        // Verify Logo
        Assert.assertEquals(
                loginPage.getLogoText(),
                "Swag Labs"
        );

        // Login
        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        // Verify Login
        Assert.assertTrue(
                driver.getCurrentUrl().contains("inventory")
        );
    }
}