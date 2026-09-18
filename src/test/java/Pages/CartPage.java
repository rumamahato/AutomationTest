package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Cart Title
    By cartTitle = By.className("title");
    public String getCartTitle() {
        return driver.findElement(cartTitle).getText();
    }

    // Cart Item
    By cartItem = By.className("inventory_item_name");
    public String getCartItemName() {
        return driver.findElement(cartItem).getText();
    }

    // Quantity
    By qty = By.cssSelector(".cart_quantity_label");
    public String getQtyText() {
        return driver.findElement(qty).getText();
    }

    // Description
    By description = By.cssSelector(".cart_desc_label");
    public String getDescriptionText() {
        return driver.findElement(description).getText();
    }

    // Continue Shopping
    By continueShoppingButton = By.cssSelector("#continue-shopping");
    public void clickContinueShopping() {
        driver.findElement(continueShoppingButton).click();
    }

    // Checkout
    By checkoutButton = By.cssSelector("#checkout");
    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}