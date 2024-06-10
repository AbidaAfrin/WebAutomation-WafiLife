package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.BrowserSetup;

public class TestShippingPage extends BrowserSetup {

    ShippingPage shippingPage = new ShippingPage();
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    TestLogin testLogin = new TestLogin();
    TestSelectProduct testSelectProduct = new TestSelectProduct();
    MyCartPage myCartPage= new MyCartPage();

@Test(description = "Shipping Page Test")
    @Description(" Test Description:This test will try to browse the shipping page and" +
            "then fill up the shipping info")
    public void fillUpShippingForm() throws InterruptedException {



        shippingPage.clickOnElement(shippingPage.selectArea);
        shippingPage.selectItem(shippingPage.selectArea,shippingPage.areaName);
        shippingPage.writeOnElement(shippingPage.address,shippingPage.addressText);
        shippingPage.addScreenshot("Shipping Page after filling the required info");
     //   shippingPage.scroll(shippingPage.paymentMethod);
       // shippingPage.clickOnElement(shippingPage.paymentMethod);
        Assert.assertTrue(shippingPage.selectStatus(shippingPage.paymentMethod));




    }
}
