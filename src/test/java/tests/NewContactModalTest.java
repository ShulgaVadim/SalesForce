package tests;

import modals.Contact;
import org.testng.annotations.Test;

public class NewContactModalTest extends BaseTest {

    @Test
    public void createContactTest() {

        Contact contact = new Contact("new", "asd", "Shulga", "Vadim",
                "junior", "+37529", "qwert@qwer.com", "+37529", "+37544",
                "testdep", "Minsk", "12345", "teststate", "BLR",
                "TestedName", "Mr.", "wallStreet");

        loginPage
                .openPage()
                .login(USERNAME, PASSWORD)
                .goToContacts()
                .clickOnNewContact()
                .createContact(contact);
    }
}