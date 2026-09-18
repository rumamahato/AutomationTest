package TestCase;

import BasicClass.Basic;
import Pages.LoginPage;
import Pages.ProductPage;
import Utilities.CustomerTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomerTestListener.class)
public class ProductPage_TestCase extends Basic {

    @Test
    public void productTest() {

        // Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        // Product Page
        ProductPage productPage = new ProductPage(driver);

        // Sort Products
        productPage.selectSortProducts("Price (low to high)");

        // Click Backpack
        productPage.addBackpack();
    }
}