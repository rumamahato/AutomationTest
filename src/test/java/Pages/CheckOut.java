package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {

    WebDriver driver;

    // Constructor
    public CheckOut(WebDriver driver) {
        this.driver = driver;
    }


    // Enter First Name
    public void enterFirstName(String firstNameValue) {
        driver.findElement(firstName).sendKeys(firstNameValue);
    }
    By firstName = By.cssSelector("#first-name");

    // Enter Last Name
    public void enterLastName(String lastNameValue) {
        driver.findElement(lastName).sendKeys(lastNameValue);
    }
    By lastName = By.cssSelector("#last-name");

    // Enter Postal Code
    public void enterPostalCode(String postalCodeValue) {
        driver.findElement(postalCode).sendKeys(postalCodeValue);
    }
    By postalCode = By.cssSelector("#postal-code");

    // Click Cancel
    public void clickCancel() {
        driver.findElement(cancelButton).click();
    }
    By cancelButton = By.cssSelector("#postal-code");

    // Click Continue
    public void clickContinue() {
        driver.findElement(continueButton).click();
    }
    By continueButton = By.cssSelector("#continue");
}