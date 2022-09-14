package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Dropdown;
import wrappers.Input;
import wrappers.TextArea;

public class NewAccountPage extends BasePage {

    private By NEW_BUTTON = By.cssSelector("[title=New]");

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "lightning/o/Account/list?filterName=Recent");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accounts' and @class='slds-var-p-right_x-small']")));
    }

    public void createAccount() {
        driver.findElement(NEW_BUTTON).click();
    }

    public void create(String rating, String accountName, String phone, String accountNumber, String website, String ownership, String industry, String shippingAdress) {
        new Dropdown("Rating", driver).select(rating);
        new Input("Account Name", driver).write(accountName);
        new Input("Phone", driver).write(phone);
        new Input("Account Number", driver).write(accountNumber);
        new Input("Website", driver).write(website);
        new Dropdown("Ownership", driver).select(ownership);
        new Dropdown("Industry", driver).select(industry);
        new TextArea("Shipping Street", driver).write(shippingAdress);
    }


}
