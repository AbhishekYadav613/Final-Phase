package testScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccount;

public class TC_LG_002 extends BaseTest {

    /**
     * CaseID: TC_LG_002
     * Validate Logging out by selecting Logout option from 'Right Column' options.
     */

    @Test
    public void TC_LG_002() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        MyAccount ma = new MyAccount(driver);
        hp.navigateToLoginPage();
        lp.loginToAccount();
        ma.logoutUsingSidePanel();
    }
}
