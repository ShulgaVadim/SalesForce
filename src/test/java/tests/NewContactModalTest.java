package tests;

import org.testng.annotations.Test;

public class NewContactModalTest extends BaseTest {

    @Test
    public void createContactTest() {
        loginPage
                .openPage()
                .login(USERNAME, PASSWORD)
                .goToContacts()
                .clickOnNewContact()
                .createContact("TestName");
    }
}