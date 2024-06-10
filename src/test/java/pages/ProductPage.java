package pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

import static utilities.BrowserSetup.getBrowser;

public class ProductPage extends BasePage {
    HomePage homePage = new HomePage();

    public String writer_name = "Arif";


    public By pagination = By.className("page-numbers");
    public By nextPageButton = By.cssSelector(".next.page-numbers");
    public By writerSearchBox = By.xpath("//input[@id='cat_search']");
    public By searchIcon = By.cssSelector("button[class='btn btn-default']");
    public By writerName = By.xpath("//h3[contains(text(),'আরিফ আজাদ')]");
    public By product = By.cssSelector("div[class='results-by-facets']>ul>li:nth-child(18)");









//    public By filterCategoriesList = By.cssSelector("#js--categoryIds");
//    public By option1 = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
//    public By option2 = By.xpath("//label[contains(text(),'উপন্যাস সমগ্র')]");
    // public By scrollDown = By.xpath("//footer[@class='large-footer']");


 //   public By page2 = By.cssSelector(".current");



  //  public By cart = By.cssSelector("img[alt='cart']");


    @BeforeMethod
    public void loadSignInPage() {
        getBrowser().get(homePage.url);
//homePage.clickOnElement(homePage.signInButton);
   }
    public void selectWriter(){
      //  getBrowser().get(homePage.url);

        homePage.clickOnElement(homePage.writerButton);

    }



    public void scrollToGoToNextPage()  {
        scroll(pagination);
        clickOnElement(nextPageButton);
       // navBarPage.scroll(navBarPage.pagination);
    }

    public void searchWriter(){
           clickOnElement(writerSearchBox);
            sendText(writerSearchBox,writer_name);
            clickOnElement(searchIcon);
            clickOnElement(writerName);
    }



    public void selectBook()  {

        scroll(product);
        clickOnElement(product);
    }


}
