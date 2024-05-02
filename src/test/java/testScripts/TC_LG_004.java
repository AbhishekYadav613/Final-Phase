package testScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccount;

public class TC_LG_004 extends BaseTest {
    /**
     * CaseID: TC_LG_004
     * Validate logging out and browsing back.
     */

    @Test

    public void TC_LG_004() throws InterruptedException {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        MyAccount ma = new MyAccount(driver);
        hp.navigateToLoginPage();
        lp.loginToAccount();
        ma.logoutUsingMyAccountDropdown();
        Thread.sleep(3000);
        driver.navigate().back();

        String title = driver.getTitle();

        if (title.equalsIgnoreCase("My Account")) {
            // returns to the account page again.
            System.out.println("TEST FAILED.");
        } else if (title.equalsIgnoreCase("Account Logout")) {

            // logged out page.
            System.out.println("TEST PASSED.");
        } else {
            System.out.println("NA");
        }

    }
}
