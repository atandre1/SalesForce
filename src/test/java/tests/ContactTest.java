package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.NewContactPage;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest {

    @Test
    public void login() {
        driver.get("https://tms-f-dev-ed.my.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("atandrei@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("5150990a");
        driver.findElement(By.id("Login")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title=Setup]")));
        driver.get("https://tms-f-dev-ed.lightning.force.com/lightning/o/Contact/list?filterName=Recent");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='Sales Console']")));
        driver.findElement(By.cssSelector("[title=New]")).click();

        new NewContactPage(driver).create("Zubik", "+37529293892", "Andrei",
                "103", "Mr.");
    }

}
