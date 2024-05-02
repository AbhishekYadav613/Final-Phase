package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass{


    public LoginPage(WebDriver driver) {
        super(driver);
    }

@FindBy (id="input-email")
    public WebElement emailField;

    @FindBy (id = "input-password")
    public WebElement passwordField;

    @FindBy (xpath = "//input[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy (linkText = "Forgotten Password")
    public WebElement forgotPasswordButton;

    @FindBy (linkText = "Logout")
    public WebElement logoutButton;


    public void loginToAccount()
    {
/*        emailField.sendKeys(Generic.getValue("email"));
        passwordField.sendKeys(Generic.getValue("password"));
        loginButton.click();
*/
        emailField.sendKeys("test613mail@gmail.com");
        passwordField.sendKeys("password.123");
        loginButton.click();
    }


}
