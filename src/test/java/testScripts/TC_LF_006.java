package testScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC_LF_006 extends BaseTest {
    /**
     * CaseID: TC_LF_006
     * Validate 'Forgotten Password' link is available in the Login page and is working.
     */


    @Test

    public void TC_LF_006() {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.navigateToLoginPage();
        lp.forgotPasswordButton.click();

    }
}
