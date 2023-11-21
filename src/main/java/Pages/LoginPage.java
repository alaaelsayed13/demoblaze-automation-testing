package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    protected WebDriver driver;
    private By usernameInput = By.id("loginusername");
    private By passwordInput = By.id("loginpassword");
    private By LoginButton = By.cssSelector("button[onclick='logIn()']");
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }
    public void SetUserName(String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(usernameInput));
        driver.findElement(usernameInput).sendKeys(username);

    }
    public void SetPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);

    }
    public void ClickLoginButton(){

        driver.findElement(LoginButton).click();
    }

}
