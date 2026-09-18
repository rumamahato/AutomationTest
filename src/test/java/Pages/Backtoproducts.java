package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Backtoproducts {

    WebDriver driver;

    // Constructor
    public Backtoproducts(WebDriver driver) {
        this.driver = driver;
    }

    // Sauce Labs Backpack
    By backpack = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");

    public void clickBackpack() {
        driver.findElement(backpack).click();
    }

    // Sauce Labs Bike Light
    By bikeLight = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");

    public void clickBikeLight() {
        driver.findElement(bikeLight).click();
    }

    // Sauce Labs Bolt T-Shirt
    By boltTShirt = By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']");

    public void clickBoltTShirt() {
        driver.findElement(boltTShirt).click();
    }

    // Sauce Labs Fleece Jacket
    By fleeceJacket = By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']");

    public void clickFleeceJacket() {
        driver.findElement(fleeceJacket).click();
    }

    // Sauce Labs Onesie
    By onesie = By.xpath("//div[normalize-space()='Sauce Labs Onesie']");

    public void clickOnesie() {
        driver.findElement(onesie).click();
    }

    // Test.allTheThings() T-Shirt (Red)
    By redTShirt = By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']");

    public void clickRedTShirt() {
        driver.findElement(redTShirt).click();
    }
}
