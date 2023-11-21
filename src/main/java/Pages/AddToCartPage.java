package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCartPage {
    protected WebDriver driver;
    private By AddToCartButton = By.xpath("//a[normalize-space()='Add to cart']");
    public AddToCartPage(WebDriver driver) {

        this.driver = driver;
    }

    public void AddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(AddToCartButton));
        driver.findElement(AddToCartButton).click();
    }
    public void AcceptAllert(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
}


