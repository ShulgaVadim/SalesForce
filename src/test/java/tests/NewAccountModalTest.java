package tests;

import org.testng.annotations.Test;

public class NewAccountModalTest extends BaseTest {

    @Test
    public void createAccountTest() {
        loginPage
                .openPage()
                .login(USERNAME, PASSWORD)
                .goToAccounts()
                .clickOnNewAccount()
                .createAccount("TestName");
    }
}
