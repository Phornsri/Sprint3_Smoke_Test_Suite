package Sprint3.tests;

import Sprint3.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Message_Tab {

    WebDriver driver;
    String browserType = "chrome";
    //Truck driver Credentials
    String URL = "https://login2.nextbasecrm.com/";
    String userName = "helpdesk28@cybertekschool.com";
    String password = "UserUser";

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(URL);
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }


    @Test
    public void uploadFile() {

//    AC#3 -User should be able to attach link by clicking on the link icon.
//    Given user is on CRM 24 dashboard
        driver.findElement(By.xpath("//span[@id='logo_24_text']")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//    And user navigate to message tab
        driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']/span")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //    Then user clicks on Link icon
        driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//    Then user should able add Url and name of Link

       driver.close();

        }
    }
