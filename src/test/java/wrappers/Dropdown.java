package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown {
    WebDriver driver;
    String label;

    public Dropdown(String label, WebDriver driver) {
        this.label = label;
        this.driver = driver;
    }

    public void select(String text) {
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//button", label))).click();
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//span[text()='%s']", label))).click();
    }
}
