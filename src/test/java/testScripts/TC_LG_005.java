package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccount;

import java.util.List;

public class TC_LG_005 extends BaseTest{

    /**
     * CaseID: TC_LG_005 (need review)
     * Validate Logout option is not displayed under 'My Account' menu before logging in.
     */

    @Test

    public void TC_LG_005()
    {
        HomePage hp = new HomePage(driver);
        hp.myAccountButton.click();

        List < WebElement> buttons = driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li"));

        for (WebElement ref : buttons)
        {
            if (ref.getText().equalsIgnoreCase("logout"))
            {
                System.out.println("TEST FAILED.");
            }
            else

                System.out.println("TEST PASSED.");

        }





    }
}
