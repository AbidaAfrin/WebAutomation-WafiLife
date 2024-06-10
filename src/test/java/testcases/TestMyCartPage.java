package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyCartPage;
import pages.ProductPage;
import utilities.BrowserSetup;

public class TestMyCartPage extends BrowserSetup {
    MyCartPage myCartPage = new MyCartPage();
//    ProductPage productPage = new ProductPage();
//    HomePage homePage =new HomePage();

    @Test(description = "My Cart Page")
    @Description("This test will try to go to my cart page")
    public void myCartPage(){

        myCartPage.goToMyCartPage();
        myCartPage.addScreenshot("My Cart Page");

    }

}
