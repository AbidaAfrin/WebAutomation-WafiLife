package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{

    public String url="https://www.wafilife.com/my-account";

    public String password ="123456";
   // public String phoneNumber = "12024740057";
    public String Email = "wowago5981@adrais.com";

    public By emailInputBox = By.id("username");
    public By passwordInputBox = By.id("password");
    public By logInButton = By.name("login");

    public By myAccount = By.xpath("//h1[contains(text(),'আমার অ্যাকাউন্ট')]");

   // public By otpErrorMsg = By.id("js--message");
    public By invalidEmailMsg = By.cssSelector("ul[class='woocommerce-error'] li");
    public By invalidPasswordMsg = By.cssSelector("ul[class='woocommerce-error'] li");

    public By errorMsg = By.xpath("//li[contains(text(),'ইউজার নাম প্রয়োজন')]");
}
