package Login;

import BaseTests.BaseTest;
import Pages.LoginPage;
import Pages.SignUpPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(priority = 2, description = "Login")
    public void SuccessfulLogin(){
        LoginPage loginPage = homePage.navigateToLogin();
        loginPage.SetUserName("AlaaElsayed");
        loginPage.SetPassword("789456123");
        loginPage.ClickLoginButton();
    }
}
