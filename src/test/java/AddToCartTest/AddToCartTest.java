package AddToCartTest;

import BaseTests.BaseTest;
import Pages.AddToCartPage;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
    @Test
    public void SuccessfulAddToCart(){
        AddToCartPage Add=homePage.GetProduct();
        Add.AddToCartButton();
        Add.AcceptAllert();
    }

}
