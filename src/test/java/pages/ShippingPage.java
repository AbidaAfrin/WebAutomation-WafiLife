package pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasePage {

    MyCartPage myCartPage = new MyCartPage();

   // public String url = "https://www.rokomari.com/shipping/new?isgift=0&isShowShippingInCartPage=false&selectedAddressId=";
    //public String customer_nameText="AAA";
   // public String phone_Number = "0123456789";
  //  public String countryName = "Bangladesh";
   // public String districtName = "Dinajpur";
    public String areaName = "কলাবাগান";
    public String addressText = "Writdfdrfhfg";

  //  public By customer_name = By.xpath("(//input[@id='name'])[1]");
  //  public By phoneNumber = By.id("phone");
 //   public By selectCountry = By.name("countryId");
    public By selectDistrict = By.cssSelector("#select2-billing_state-container");
    //public By selectCity = By.name("cityId");
    public By selectArea = By.xpath("//select[@id='billing_area']");
    public By address = By.cssSelector("#billing_address_1");
    public By paymentMethod = By.cssSelector("#payment_method_cod");










}