package testScripts;

import org.openqa.selenium.bidi.log.Log;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccount;

public class TC_LG_001 extends BaseTest {

    /**
     * CaseID: TC_LG_001
     * Validate Logging out by selecting Logout option from 'My Account' drop menu.
     */

    @Test

    public void TC_LG_001() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        MyAccount ma = new MyAccount(driver);
        hp.navigateToLoginPage();
        lp.loginToAccount();
        ma.logoutUsingMyAccountDropdown();
    }
}
