package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.NewContactPage;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class ContactCreationTest extends BaseTest {

    @Test
    public void createContact() {
        loginPage.open();
        loginPage.login("atandrei@yahoo.com", "tms2022tms");
        newContactPage.openPage();
        newContactPage.createNewContact();
        newContactPage.create("Andrew", "Zubik", "Mr.", "+375293452345",
                "2234567", "375293452345", "qa engineer", "QA",
                "zubik@cia.gov", "02.15.2008", "Web", "Washington DC, 2354");
    }

}
