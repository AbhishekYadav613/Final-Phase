package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Generic;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void start()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
       // driver.get(Generic.getValue("url"));
        driver.get("https://naveenautomationlabs.com/opencart/");
    }


    @AfterClass
    public void close() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
