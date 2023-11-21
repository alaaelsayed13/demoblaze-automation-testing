package CompleteOrder;

import BaseTests.BaseTest;
import Pages.CompleteOrderPage;
import Pages.SignUpPage;
import org.testng.annotations.Test;

public class CompleteOrderTest extends BaseTest {
    @Test
    public void SuccessfulPurchase(){
        CompleteOrderPage complete=homePage.GetCart();
        complete.PlaceOrder();
        complete.SetName("Alaa");
        complete.setCountry("Egypt");
        complete.setCity("Mansoura");
        complete.setCard("789456123");
        complete.setMonth("May");
        complete.setYear("2000");
        complete.ClickPurchase();
        complete.setOk();
    }

}
