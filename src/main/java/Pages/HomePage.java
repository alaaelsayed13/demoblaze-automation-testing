package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private By signUpLink = By.id("signin2");
    private By loginlink=By.id("login2");
    private By product= By.linkText("Samsung galaxy s6");
    private By Cart =By.id("cartur");
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public SignUpPage navigateToSignUp() {
        driver.findElement(signUpLink).click();
        return new SignUpPage(driver);
    }

    public LoginPage navigateToLogin() {
        driver.findElement(loginlink).click();
        return new LoginPage(driver);
    }
    public AddToCartPage GetProduct(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(product));
        driver.findElement(product).click();
        return new AddToCartPage(driver);
    }
    public CompleteOrderPage GetCart(){
        driver.findElement(Cart).click();
        return new CompleteOrderPage(driver);
    }

}
