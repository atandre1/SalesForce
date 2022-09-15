package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Dropdown {
    WebDriver driver;
    String label;

    public Dropdown(String label, WebDriver driver) {
        this.label = label;
        this.driver = driver;
    }

    public void select(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//button", label))).click();
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//span[text()='%s']", label, text))).click();
    }
}
