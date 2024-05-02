package testScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC_LF_009 extends BaseTest {

    /**
     * CaseId: TC_LF_009
     * Validate Logging into the Application and browsing back using Browser back button.
     */
    @Test

    public void TC_LF_009() {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.navigateToLoginPage();
        lp.emailField.sendKeys("test613mail@gmail.com");
        lp.passwordField.sendKeys("password.123");
        lp.loginButton.click();
        driver.navigate().back();
        String title = driver.getTitle();

        if (title.equalsIgnoreCase("My account")) {
            System.out.println("User Is On My Account Page.");
        } else {
            System.out.println("User Logged Out.");
        }


    }


}
