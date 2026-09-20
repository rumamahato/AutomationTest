package TestCase;

import BasicClass.Basic;
import Pages.CartPage;
import Pages.LoginPage;
import Pages.ProductPage;
import Utilities.CustomerTestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomerTestListener.class)
public class CartPage_TestCase extends Basic {

    @Test
    public void cartTest() {

        // Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        // Product Page
        ProductPage productPage = new ProductPage(driver);

        // Add Backpack
        productPage.addBackpack();

        // Open Cart
        productPage.clickCart();

        // Cart Page
        CartPage cartPage = new CartPage(driver);

        // Verify Cart Title
        Assert.assertEquals(
                cartPage.getCartTitle(),
                "Your Cart",
                "Cart title is incorrect"
        );

        // Verify Product Name
        Assert.assertEquals(
                cartPage.getCartItemName(),
                "Sauce Labs Backpack",
                "Product name is incorrect"
        );

        // Verify Quantity
        Assert.assertEquals(
                cartPage.getQtyText(),
                "QTY",
                "Quantity label is incorrect"
        );

        // Verify Description
        Assert.assertEquals(
                cartPage.getDescriptionText(),
                "DESCRIPTION",
                "Description label is incorrect"
        );
    }
}