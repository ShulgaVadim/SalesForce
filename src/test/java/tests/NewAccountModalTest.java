package tests;

import modals.Account;
import org.testng.annotations.Test;

public class NewAccountModalTest extends BaseTest {

    @Test
    public void createAccountTest() {

        Account account = new Account("TestedName", "+37529", "web@web.com",
                "20", "TestCity", "TestState", "TestZIP",
                "TestCountry", "TestCity", "testState", "testZIP",
                "testCountry", "Construction", "Press", "testDescription",
                "testBillingStreet", "testShippingStreet");
        loginPage
                .openPage()
                .login(USERNAME, PASSWORD)
                .goToAccounts()
                .clickOnNewAccount()
                .createAccount(account)
                .isAccountCreated("TestedName");
    }
}
