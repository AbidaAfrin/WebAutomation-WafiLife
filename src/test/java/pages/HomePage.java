package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String url="https://www.wafilife.com/";

    public By signInButton = By.cssSelector("div[class='login-links'] a[title='আমার অ্যাকাউন্ট']");
    public By userIcon = By.xpath("//span[@class='user-name']");





    public By writerButton= By.cssSelector("div[class='main-menu pc-menu wd-mega-menu-wrapper']>ul>li:nth-child(6)>a>span");


}
