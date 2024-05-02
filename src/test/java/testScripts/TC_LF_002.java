package testScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC_LF_002 extends BaseTest {

    /**
     * Test Case Id: TC_LF_002
     * Summary: Validate logging into the Application using valid credentials.
     */

    @Test

    public void TC_LF_002() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.navigateToLoginPage();
        lp.loginToAccount();
        Thread.sleep(4000);
    }

}
