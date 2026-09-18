package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Logo
        public String getLogoText() {
        return driver.findElement(logo).getText();
    }
    By logo = By.cssSelector(".login_logo");


        // Username
    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }
    By username = By.cssSelector("#user-name");

    // Password
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }
    By password = By.cssSelector("#password");

    // Login Button
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    By loginButton = By.cssSelector("#login-button");

    // Login
    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}