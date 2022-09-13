package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    public final String username = "atandrei@yahoo.com";
    public final String password = "5150990a";

    public static final String BASE_URL = "https://tms-f-dev-ed.my.salesforce.com/";

    public BasePage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean waitForVisibility(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException ex) {
            return false;
        }
        return true;
    }

    public void waitForPageLoaded() {
        new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
            }
        };
    }

    public void clickJS(By locator) {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(locator)).keyDown("0").pause(500).keyUp("0").click().build().perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(locator));  //Если перестает работать Selenium
    }

}
