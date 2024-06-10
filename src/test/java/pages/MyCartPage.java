package pages;


import org.openqa.selenium.By;

public class MyCartPage extends BasePage {




    public By orderButton = By.xpath("//div[@class='body-wrapper']//button[2]");
    public By cartButton = By.cssSelector("a[title='View your shopping cart'] i[class='fa fa-shopping-cart']");
    public By placeOrderButton = By.cssSelector(".button.checkout.wc-forward");



    public void goToMyCartPage(){
        clickOnElement(orderButton);
        clickOnElement(cartButton);
        clickOnElement(placeOrderButton);


    }
}
