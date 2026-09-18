package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Remove_YourCart {

    WebDriver driver;
    // Constructor
    public Remove_YourCart(WebDriver driver) {
        this.driver = driver;
    }

    // Remove Sauce Labs Bike Light
    By removeBikeLight = By.id("remove-sauce-labs-bike-light");

    public void removeBikeLight() {
        driver.findElement(removeBikeLight).click();
    }

    // Remove Sauce Labs Bolt T-Shirt
    By removeBoltTshirt = By.id("remove-sauce-labs-bolt-t-shirt");

    public void removeBoltTshirt() {
        driver.findElement(removeBoltTshirt).click();
    }

    // Remove Sauce Labs Fleece Jacket
    By removeFleeceJacket = By.id("remove-sauce-labs-fleece-jacket");

    public void removeFleeceJacket() {
        driver.findElement(removeFleeceJacket).click();
    }

    // Remove Sauce Labs Onesie
    By removeOnesie = By.id("remove-sauce-labs-onesie");

    public void removeOnesie() {
        driver.findElement(removeOnesie).click();
    }

    // Remove Sauce Labs Backpack
    By removeBackpack = By.id("remove-sauce-labs-backpack");

    public void removeBackpack() {
        driver.findElement(removeBackpack).click();
    }

    // Remove Test.allTheThings() T-Shirt (Red)
    By removeRedTshirt = By.id("remove-test.allthethings()-t-shirt-(red)");

    public void removeRedTshirt() {
        driver.findElement(removeRedTshirt).click();
    }

    // Continue Shopping
    By continueShopping = By.id("continue-shopping");

    public void clickContinueShopping() {
        driver.findElement(continueShopping).click();
    }

    // Checkout
    By checkout = By.id("checkout");

    public void clickCheckout() {
        driver.findElement(checkout).click();
    }
}