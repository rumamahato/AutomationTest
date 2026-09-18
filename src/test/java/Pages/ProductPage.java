package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    WebDriver driver;

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Sauce-Labs-Backpack
    public void addBackpack() {
        driver.findElement(backpack).click();
    }
    By backpack = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");


    // Sauce-Labs-Bike-Light
    public void addBikeLight() {
        driver.findElement(bikeLight).click();
    }
    By bikeLight = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");


    // Sauce-Labs-Bolt-T-Shirt
    public void addBoltTShirt() {
        driver.findElement(boltTShirt).click();
    }
    By boltTShirt = By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']");


    // Sauce-Labs-Fleece-Jacket
    public void addFleeceJacket() {
        driver.findElement(fleeceJacket).click();
    }
    By fleeceJacket = By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']");


    // Sauce-Labs-Onesie
    public void addOnesie() {
        driver.findElement(onesie).click();
    }
    By onesie = By.xpath("//div[normalize-space()='Sauce Labs Onesie']");


    // Test.allTheThings
    public void addRedTShirt() {
        driver.findElement(redTShirt).click();
    }
    By redTShirt = By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']");


    // Cart Icon
    public void clickCart() {
        driver.findElement(cartIcon).click();
    }
    By cartIcon = By.className("shopping_cart_link");

    // Sort products
    public void selectSortProducts(String option) {
        Select select = new Select(driver.findElement(sortProducts));
        select.selectByVisibleText(option);
    }
    By sortProducts = By.xpath("//select[@aria-label='Sort products']");

}