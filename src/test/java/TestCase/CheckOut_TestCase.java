package TestCase;

import BasicClass.Basic;
import Pages.CheckOut;
import org.testng.annotations.Test;

public class CheckOut_TestCase extends Basic {

    @Test
    public void checkoutInformationTest() {

        // Create CheckOut object
        CheckOut checkout = new CheckOut(driver);

        // Enter checkout information
        checkout.enterFirstName("Ruma");
        checkout.enterLastName("Mahato");
        checkout.enterPostalCode("44700");

        // Click Continue
        checkout.clickContinue();
    }
}