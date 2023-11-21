package BaseTests;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void SetUp(){
        driver = new ChromeDriver();
        GoHome();
        homePage= new HomePage(driver);
    }
    public void GoHome(){
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
    }
   @AfterClass
  public void teardown(){

     driver.quit();
    }
}


