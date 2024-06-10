package testcases;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyCartPage;
import pages.ProductPage;
import pages.SignInPage;
import utilities.BrowserSetup;

public class TestSelectProduct extends BrowserSetup {


    ProductPage productPage = new ProductPage();
  //  MyCartPage myCartPage = new MyCartPage();



@Test(description = "Select a book after filtering writer and categories")
@Description(" Test Description : This test will try to select a writer menue," +
        "go to next page,search for specific writer and selects a book")
    public void selectProduct()  {
    //getBrowser().get(homePage.url);

        productPage.selectWriter();
        productPage.addScreenshot("Collection of books");

        productPage.scrollToGoToNextPage();
        productPage.addScreenshot("Book Collection-2nd page");

        productPage.searchWriter();
        productPage.addScreenshot("Book Collection of the selected writer");

        //Thread.sleep(3000);
        productPage.selectBook();
        productPage.addScreenshot("After selecting a book");
        //Thread.sleep(2000);
//        myCartPage.GoToMyCartPage();

    }


}
