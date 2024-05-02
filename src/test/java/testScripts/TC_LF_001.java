package testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC_LF_001 extends BaseTest {

    /**
     * CaseID: TC_LF_001 (Successful)
     * Validate logging into the Application using valid credentials.
     */

    @Test

    public void TC_LF_001() {
        HomePage hp = new HomePage(driver);
        LoginPage lp = new LoginPage(driver);
        hp.navigateToLoginPage();
        lp.emailField.sendKeys("test613mail@gmail.com");
        lp.passwordField.sendKeys("password.123");
        lp.loginButton.click();

        String login = driver.findElement(By.xpath("(//div[@class='row']/div/h2)[1]")).getText();

        if (login.equalsIgnoreCase("My Account")) {
            System.out.println("LOGIN SUCCESSFUL.");
        } else {
            System.out.println("LOGIN FAIL.");
        }

    }
}
