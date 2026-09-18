package TestCase;

import BasicClass.Basic;
import Pages.Backtoproducts;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class Backtoproducts_TestCase extends Basic {

    @Test
    public void verifyAllProducts() {

        // Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        // Products
        Backtoproducts products = new Backtoproducts(driver);

        // Backpack
        products.clickBackpack();
        driver.navigate().back();

        // Bike Light
        products.clickBikeLight();
        driver.navigate().back();

        // Bolt T-Shirt
        products.clickBoltTShirt();
        driver.navigate().back();

        // Fleece Jacket
        products.clickFleeceJacket();
        driver.navigate().back();

        // Onesie
        products.clickOnesie();
        driver.navigate().back();

        // Red T-Shirt
        products.clickRedTShirt();
        driver.navigate().back();
    }
}