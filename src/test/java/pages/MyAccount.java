package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BaseClass{
    public MyAccount(WebDriver driver) {
        super(driver);
    }


    @FindBy (linkText = "Logout")
    public WebElement logoutButtonMyAccountDropdown;

    @FindBy (xpath = "//div[@class='list-group']/a[13]")
    public WebElement sidePanelLogoutButton;


    public void logoutUsingMyAccountDropdown()
    {
        HomePage hp = new HomePage(driver);
        hp.myAccountButton.click();
        logoutButtonMyAccountDropdown.click();

    }

    public void logoutUsingSidePanel()
    {
        sidePanelLogoutButton.click();
    }
}
