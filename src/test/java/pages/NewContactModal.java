package pages;

import elements.Input;
import elements.Select;
import elements.TextArea;
import io.qameta.allure.Step;
import modals.Contact;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class NewContactModal {
    WebDriver driver;
    WebDriverWait wait;
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");


    public NewContactModal(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    @Step("Create new Contact")
    public ContactsPage createContact(Contact contact) {
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Middle Name").write(contact.getMiddleName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Suffix").write(contact.getSuffix());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZIP());
        new Input(driver, "Mailing State/Province").write(contact.getMailingState());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new Input(driver, "Account Name").clickAndSelect(contact.getAccountName());
        new Select(driver, "Salutation").select(contact.getSalutation());
        new TextArea(driver, "Mailing Street").fill(contact.getMailingStreet());

        driver.findElement(SAVE_BUTTON).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(SAVE_BUTTON));
        return new ContactsPage(driver);
    }
}
