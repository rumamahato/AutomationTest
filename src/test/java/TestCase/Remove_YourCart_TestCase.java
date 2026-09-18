package TestCase;

import BasicClass.Basic;
import Pages.Remove_YourCart;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Remove_YourCart_TestCase extends Basic {

    // Remove Sauce Labs Bike Light
    @Test
    public void removeBikeLightTest() {

        Remove_YourCart removeCart = new Remove_YourCart(driver);

        removeCart.removeBikeLight();

        boolean productRemoved = driver.findElements(
                By.id("remove-sauce-labs-bike-light")
        ).isEmpty();

        Assert.assertTrue(productRemoved,
                "Sauce Labs Bike Light was not removed from cart");

        System.out.println("Sauce Labs Bike Light removed successfully");
    }


    // Remove Sauce Labs Bolt T-Shirt
    @Test
    public void removeBoltTshirtTest() {

        Remove_YourCart removeCart = new Remove_YourCart(driver);

        removeCart.removeBoltTshirt();

        boolean productRemoved = driver.findElements(
                By.id("remove-sauce-labs-bolt-t-shirt")
        ).isEmpty();

        Assert.assertTrue(productRemoved,
                "Sauce Labs Bolt T-Shirt was not removed from cart");

        System.out.println("Sauce Labs Bolt T-Shirt removed successfully");
    }


    // Remove Sauce Labs Fleece Jacket
    @Test
    public void removeFleeceJacketTest() {

        Remove_YourCart removeCart = new Remove_YourCart(driver);

        removeCart.removeFleeceJacket();

        boolean productRemoved = driver.findElements(
                By.id("remove-sauce-labs-fleece-jacket")
        ).isEmpty();

        Assert.assertTrue(productRemoved,
                "Sauce Labs Fleece Jacket was not removed from cart");

        System.out.println("Sauce Labs Fleece Jacket removed successfully");
    }


    // Remove Sauce Labs Onesie
    @Test
    public void removeOnesieTest() {

        Remove_YourCart removeCart = new Remove_YourCart(driver);

        removeCart.removeOnesie();

        boolean productRemoved = driver.findElements(
                By.id("remove-sauce-labs-onesie")
        ).isEmpty();

        Assert.assertTrue(productRemoved,
                "Sauce Labs Onesie was not removed from cart");

        System.out.println("Sauce Labs Onesie removed successfully");
    }


    // Remove Sauce Labs Backpack
    @Test
    public void removeBackpackTest() {

        Remove_YourCart removeCart = new Remove_YourCart(driver);

        removeCart.removeBackpack();

        boolean productRemoved = driver.findElements(
                By.id("remove-sauce-labs-backpack")
        ).isEmpty();

        Assert.assertTrue(productRemoved,
                "Sauce Labs Backpack was not removed from cart");

        System.out.println("Sauce Labs Backpack removed successfully");
    }


    // Remove Red T-Shirt
    @Test
    public void removeRedTshirtTest() {

        Remove_YourCart removeCart = new Remove_YourCart(driver);

        removeCart.removeRedTshirt();

        boolean productRemoved = driver.findElements(
                By.id("remove-test.allthethings()-t-shirt-(red)")
        ).isEmpty();

        Assert.assertTrue(productRemoved,
                "Red T-Shirt was not removed from cart");

        System.out.println("Red T-Shirt removed successfully");
    }


    // Continue Shopping
    @Test
    public void continueShoppingTest() {

        Remove_YourCart removeCart = new Remove_YourCart(driver);

        removeCart.clickContinueShopping();

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("inventory"),
                "User was not redirected to Products page"
        );

        System.out.println("Continue Shopping worked successfully");
    }

    // Checkout
    @Test
    public void checkoutTest() {

        Remove_YourCart removeCart = new Remove_YourCart(driver);

        removeCart.clickCheckout();

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("checkout-step-one"),
                "User was not redirected to Checkout page"
        );

        System.out.println("Checkout button worked successfully");
    }
}

