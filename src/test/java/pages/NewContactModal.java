package pages;

import elements.Input;
import elements.Select;
import elements.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewContactModal {
    WebDriver driver;
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");
    String createdContact = "//span[text()='%s']";

    public NewContactModal(WebDriver driver) {
        this.driver = driver;
    }

    public ContactsPage createContact(String contactName) {
        new Input(driver, "First Name").write(contactName);
        new Input(driver, "Middle Name").write("testMiddleName");
        new Input(driver, "Last Name").write("testLastName");
        new Input(driver, "Suffix").write("testSuffix");
        new Input(driver, "Title").write("testTitle");
        new Input(driver, "Email").write("testEmail");
        new Input(driver, "Phone").write("+12345");
        new Input(driver, "Mobile").write("testMobile");
        new Input(driver, "Department").write("testDepartment");
        new Input(driver, "Fax").write("+12345");
        new Input(driver, "Mailing City").write("testCity");
        new Input(driver, "Mailing Zip/Postal Code").write("testZIP");
        new Input(driver, "Mailing State/Province").write("testProvince");
        new Input(driver, "Mailing Country").write("testCountry");
        new Input(driver, "Account Name").clickAndSelect("TestName");
        new Select(driver, "Salutation").select("Mr.");
        new TextArea(driver, "Mailing Street").fill("testMailingStreet");

        driver.findElement(SAVE_BUTTON).click();
        driver.findElement(By.xpath(String.format(createdContact, contactName)));
        return new ContactsPage(driver);
    }
}
