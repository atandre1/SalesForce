package tests;

import org.testng.annotations.Test;

public class AccountCreationTest extends BaseTest{

    @Test
    public void createAccount() {
        loginPage.open();
        loginPage.login("atandrei@yahoo.com", "tms2022tms");
        newAccountPage.open();
        newAccountPage.createAccount();
        newAccountPage.create("Warm", "Zubik007", "+375295145268", "007",
                "zubik.cia.gov", "Private", "Government", "Washington DC, 2341");
    }
}
