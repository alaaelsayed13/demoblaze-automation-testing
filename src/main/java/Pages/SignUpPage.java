package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {
    protected WebDriver driver;

    private By usernameInput = By.id("sign-username");
    private By passwordInput = By.id("sign-password");
    private By signUpButton = By.cssSelector("button[onclick='register()']");
    //private By CancelButton =By.xpath("//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']");
    public SignUpPage(WebDriver driver) {

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
    public void ClickSignUpButton(){
        driver.findElement(signUpButton).click();
    }
    public void AcceptAllert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }

    public void ClickCancelButton(){
        driver.findElement(signUpButton).click();
    }
}
