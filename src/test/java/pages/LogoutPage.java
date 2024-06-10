package pages;

import org.openqa.selenium.By;

public class LogoutPage extends BasePage{



    public By myAccountButton = By.cssSelector("div[class='login-links'] a[title='আমার অ্যাকাউন্ট']");
    public By logOutButton = By.xpath("//a[contains(text(),'লগআউট')]");
    public By logInText = By.xpath("//h2[contains(text(),'লগইন')]");


    public void clickSignOut(){
       clickOnElement(myAccountButton);
       //scroll(signOutButton);
       clickOnElement(logOutButton);


    }
}
