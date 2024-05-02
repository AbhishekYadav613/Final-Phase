package testScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class TC_RF_001 extends BaseTest {

    /**
     * CaseID: TC_RF_001
     * Validate Registering an Account by providing only the Mandatory fields.
     **/

    @Test

    public void TC_RF_001() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        RegisterPage rp = new RegisterPage(driver);
        hp.navigateToRegisterPage();
        rp.registerNewUser();

    }
}
