package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogoutPage;
import utilities.BrowserSetup;
public class TestLogout extends BrowserSetup {


    LogoutPage logoutPage = new LogoutPage();



@Test(description = "Sign out from the logged account")
@Description("Test Description: Sign Out from account")
    public void logOut(){
        logoutPage.addScreenshot("Before Sign Out");
        logoutPage.clickSignOut();
        logoutPage.addScreenshot("After Sign Out");
        Assert.assertTrue(logoutPage.displayStatus(logoutPage.logInText));
    }
}
