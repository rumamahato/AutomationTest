package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.className("shopping_cart_link");
    By cartItem = By.className("inventory_item_name");
    By checkoutButton = By.id("checkout");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpack() {
        driver.findElement(backpack).click();
    }

    public void clickCart() {
        driver.findElement(cartIcon).click();
    }

    public String getCartItemName() {
        return driver.findElement(cartItem).getText();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }
}