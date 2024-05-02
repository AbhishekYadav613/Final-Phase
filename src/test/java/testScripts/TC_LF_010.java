package testScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC_LF_010 extends BaseTest {
    /**
     * CaseId: TC_LF_010
     * Validate Logging out from the Application and browsing back
     * using Browser back button.
     */

    @Test

    public void TC_LF_010() {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.navigateToLoginPage();
        lp.emailField.sendKeys("test613mail@gmail.com");
        lp.passwordField.sendKeys("password.123");
        lp.loginButton.click();
        hp.myAccountButton.click();
        lp.logoutButton.click();
        driver.navigate().back();

        String title = driver.getTitle();

        if (title.equalsIgnoreCase("My account")) {
            System.out.println("Test Failed.");
        } else {
            System.out.println("Test Passed.");
        }


    }

}
