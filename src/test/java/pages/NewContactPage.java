package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Dropdown;
import wrappers.Input;
import wrappers.TextArea;

public class NewContactPage extends BasePage {

    private By NEW_BUTTON = By.cssSelector("[title=New]");

    public NewContactPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(BASE_URL + "lightning/o/Contact/list?filterName=Recent");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Contacts' and @class='slds-var-p-right_x-small']")));
    }

    public void createNewContact() {
        driver.findElement(NEW_BUTTON).click();
    }

    public void create(String firstName, String lastName, String salutation, String phone,  String homePhone,  String mobilePhone, String title, String department,
                       String email, String birthdate, String leadSource, String mailingStreet) {
        new Input("First Name", driver).write(firstName);
        new Input("Last Name", driver).write(lastName);
        new Dropdown("Salutation", driver).select(salutation);
        new Input("Phone", driver).write(phone);
        new Input("Home Phone", driver).write(homePhone);
        new Input("Mobile", driver).write(mobilePhone);
        new Input("Title", driver).write(title);
        new Input("Department", driver).write(department);
        new Input("Email", driver).write(email);
        new Input("Birthdate", driver).write(birthdate);
        new Dropdown("Lead Source", driver).select(leadSource);
        new TextArea("Mailing Street", driver).write(mailingStreet);
    }


}
