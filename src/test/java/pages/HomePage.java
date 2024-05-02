package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{
    public HomePage(WebDriver driver) {
        super(driver);
    }

@FindBy (xpath = "//span[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy (id = "wishlist-total")
    public WebElement wishlistButton;

    @FindBy (xpath = "//span[text()='Shopping Cart']")
    public WebElement shoppingCartButton;

    @FindBy (xpath = "//span[text()='Checkout']")
    public WebElement checkoutButton;

    @FindBy (linkText = "Login")
    public WebElement loginOption;

    @FindBy (linkText = "Register")
    public WebElement registerButton;


    public void navigateToLoginPage()
    {
        myAccountButton.click();
        loginOption.click();

    }

    public void navigateToRegisterPage()
    {
        myAccountButton.click();
        registerButton.click();

    }


}
