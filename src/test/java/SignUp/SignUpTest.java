package SignUp;

import BaseTests.BaseTest;
import Pages.LoginPage;
import Pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class SignUpTest extends BaseTest {
@Test(priority = 1,description = "Register")
public void SuccessfulSignup() {
    SignUpPage signUpPage=homePage.navigateToSignUp();
    signUpPage.SetUserName("AlaaElsayed89");
    signUpPage.SetPassword("789456123");
    signUpPage.ClickSignUpButton();
    signUpPage.AcceptAllert();
}

}
