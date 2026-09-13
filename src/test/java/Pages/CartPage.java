package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    // Locators
    By cartTitle = By.className("title");
    By qty = By.xpath("//div[@class='cart_quantity_label']");
    By description = By.xpath("//div[@class='cart_desc_label']");
    By continueShoppingButton = By.id("continue-shopping");
    By checkoutButton = By.id("checkout");

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods

    // Get "Your Cart" text
    public String getCartTitle() {
        return driver.findElement(cartTitle).getText();
    }

    // Get "QTY" text
    public String getQtyText() {
        return driver.findElement(qty).getText();
    }

    // Get "Description" text
    public String getDescriptionText() {
        return driver.findElement(description).getText();
    }

    // Click Continue Shopping
    public void clickContinueShopping() {
        driver.findElement(continueShoppingButton).click();
    }

    // Click Checkout
    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}