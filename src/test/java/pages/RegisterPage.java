package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Generic;

public class RegisterPage extends BaseClass{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

@FindBy (id = "input-firstname")
    public WebElement firstNameField;

    @FindBy (id = "input-lastname")
    public WebElement lastNameField;

    @FindBy (id = "input-email")
    public WebElement emailField;

    @FindBy (id = "input-telephone")
    public WebElement telephoneField;

    @FindBy (id = "input-password")
    public  WebElement passwordField;

    @FindBy (id = "input-confirm")
    public WebElement confirmPasswordField;

    @FindBy (name = "agree")
    public WebElement privacyPolicyCheckbox;

    @FindBy (className = "btn btn-primary")
    public WebElement continueButton;


    public void registerNewUser()
    {
        firstNameField.sendKeys(Generic.firstName());
        lastNameField.sendKeys(Generic.lastName());
        emailField.sendKeys(Generic.email());
        telephoneField.sendKeys(Generic.mobile());
        passwordField.sendKeys(Generic.password());
        confirmPasswordField.sendKeys(Generic.password());
        privacyPolicyCheckbox.click();
        continueButton.click();

    }


}

