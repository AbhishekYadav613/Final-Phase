package testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC_LF_012 extends BaseTest {

    /**
     * CaseID: TC_LF_012
     * Validate the number of unsuccessful login attempts.
     */

    @Test

    public void TC_LF_012() {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);

        String alert = " Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";

        for (int i = 0; i <= 4; i++) {
            hp.navigateToLoginPage();
            lp.loginToAccount();
            lp.loginButton.click();
        }

        String msg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']/i")).getText();

        if (msg.equalsIgnoreCase(alert)) {
            System.out.println("Test Passed.");
        } else {
            System.out.println("Test Failed.");
        }

    }
}
