package testScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC_LF_005 extends BaseTest {

    /**
     * CaseID: TC_LF_005
     * Validate logging into the Application without providing any credentials.
     */

    @Test

    public void TC_LF_005() {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.navigateToLoginPage();
        lp.loginButton.click();

    }
}
