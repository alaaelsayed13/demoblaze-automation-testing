package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompleteOrderPage {
    protected WebDriver driver;
    private By PlaceOrder= By.xpath("(//button[normalize-space()='Place Order'])[1]");
    private By name=By.id("name");
    private By country=By.id("country");
    private By city=By.id("city");
    private By card=By.id("card");
    private By month=By.id("month");
    private By year=By.id("year");
    private By purchase= By.xpath("//button[normalize-space()='Purchase']");
    private By ok=By.className("sa-confirm-button-container") ;
    public CompleteOrderPage(WebDriver driver) {

        this.driver = driver;
    }
    public void PlaceOrder(){
        driver.findElement(PlaceOrder).click();
    }
    public void SetName(String cname){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(name));
        driver.findElement(name).sendKeys(cname);
    }
    public void setCountry(String ccountry){
        driver.findElement(country).sendKeys(ccountry);
    }
    public void setCity(String ccity){
        driver.findElement(city).sendKeys(ccity);
    }
    public void setCard(String ccard){
        driver.findElement(card).sendKeys(ccard);
    }
    public void setMonth(String cmonth){
        driver.findElement(month).sendKeys(cmonth);
    }
    public void setYear(String cyear){
        driver.findElement(year).sendKeys(cyear);
    }
public void ClickPurchase(){
        driver.findElement(purchase).click();
}
    public void setOk(){
        driver.findElement(ok).click();
    }
}
