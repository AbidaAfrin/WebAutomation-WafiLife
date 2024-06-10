package pages;


//import io.qameta.allure.Allure;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static utilities.BrowserSetup.getBrowser;

public class BasePage {

    public WebElement getElement(By locator){
        return getBrowser().findElement(locator);
    }

    public void writeOnElement(By locator, String text ){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public Boolean displayStatus(By locator){
        try {
            return getElement(locator).isDisplayed();
        }catch(NoSuchElementException e){
            return false;
        }

    }

    public Boolean selectStatus(By locator){
        return getElement(locator).isSelected();
    }

    public String getTitle(){
        return getBrowser().getTitle();
    }

    public String getText(By locator){
        return getElement(locator).getText();
    }


//    public int getSize(By locator){
//        return getElement(locator).size();
//    }

    public String getAttributeValue(By locator,String attribute){
        return getElement(locator).getAttribute(attribute);
    }

public void sendText(By locator,String value){
        getElement(locator).clear();
        getElement(locator).sendKeys(value);
}

    public void clickOnElement(By locator){
        getElement(locator).click();
    }


    public Alert getAlert(){
        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public void hover(By locator){
        WebElement hoverElement = getElement(locator);
        Actions actions = new Actions(getBrowser());
        actions.clickAndHold(hoverElement).build().perform();
    }

    public void scroll(By locator){
        WebElement scrollElement = getElement(locator);
        Actions actions = new Actions(getBrowser());
        actions.scrollToElement(scrollElement).build().perform();

    }

    public Alert alertWait(){
        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(30));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        return alert;
    }

    public void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

//    public void waitForLoadPage(){
//        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(30));
//        wait.until(ExpectedConditions<Boolean>)
//    }

    public void selectItem(By locator, String visibleText){
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(visibleText);
    }


    public void addScreenshot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getBrowser()).getScreenshotAs(OutputType.BYTES)))  ;
    }

}
