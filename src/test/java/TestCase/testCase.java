package TestCase;

import BasicClass.Basic;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class testCase extends Basic {

    @Test
    public void validLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");
    }
}