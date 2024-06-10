package testcases;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import utilities.BrowserSetup;

public class TestLogin extends BrowserSetup {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @BeforeMethod
    public void loadSignInPage() {
        getBrowser().get(homePage.url);
        homePage.clickOnElement(homePage.signInButton);
    }


    @Test(priority = 0, description = " User log in with valid Credentials")
    @Description(" Test Add using allure: User log in with valid Credentials")
    @Epic("Web interface")
    @Feature("Essential features")
    @Story("Authentication")

    public void testLoginWithValidCredentials() {

        signInPage.addScreenshot("Before adding data");
        signInPage.writeOnElement(signInPage.emailInputBox, signInPage.Email);
        signInPage.writeOnElement(signInPage.passwordInputBox, signInPage.password);
        signInPage.addScreenshot("After add data");
        signInPage.clickOnElement(signInPage.logInButton);
        signInPage.addScreenshot("After login");
        Assert.assertTrue(signInPage.displayStatus(signInPage.myAccount));

    }

    @Test

    public void testLogInWithInvalidEmail() {
        signInPage.writeOnElement(signInPage.emailInputBox, "dfsaf@com");
        signInPage.writeOnElement(signInPage.passwordInputBox, signInPage.password);
        signInPage.clickOnElement(signInPage.logInButton);
        Assert.assertTrue(signInPage.displayStatus(signInPage.invalidEmailMsg));
    }

    @Test

    public void testLogInWithInvalidPassword() {
        signInPage.writeOnElement(signInPage.emailInputBox, signInPage.Email);
        signInPage.writeOnElement(signInPage.passwordInputBox, "123456");
        signInPage.clickOnElement(signInPage.logInButton);
        Assert.assertTrue(signInPage.displayStatus(signInPage.invalidPasswordMsg));
    }
}


