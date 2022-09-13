package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Dropdown;
import wrappers.Input;

public class NewContactPage extends BasePage{

    public NewContactPage(WebDriver driver) {
        super(driver);
    }

    public void create(String lastName, String phone, String firstName, String homePhone, String salutation) {
        new Input("First Name", driver).write(firstName);
        new Input("Last Name", driver).write(lastName);
        new Input("Phone", driver).write(phone);
        new Input("Home Phone", driver).write(homePhone);

        new Dropdown("Salutation", driver).select(salutation);
    }


}
