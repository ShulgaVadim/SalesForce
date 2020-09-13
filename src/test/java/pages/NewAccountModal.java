package pages;

import elements.Input;
import elements.Select;
import elements.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModal {
    WebDriver driver;
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");
    String createdAccount = "//span[text()='%s']";

    public NewAccountModal(WebDriver driver) {
        this.driver = driver;
    }

    public AccountsPage createAccount(String accountName) {
        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Phone").write("TestPhone");
        new Input(driver, "Website").write("TestWeb");
        new Input(driver, "Employees").write("TestNumber");
        new Input(driver, "Billing City").write("TestCity");
        new Input(driver, "Billing State/Province").write("TestState");
        new Input(driver, "Billing Zip/Postal Code").write("TestZIP");
        new Input(driver, "Billing Country").write("TestCountry");
        new Input(driver, "Shipping City").write("testCity");
        new Input(driver, "Shipping State/Province").write("testState");
        new Input(driver, "Shipping Zip/Postal Code").write("testZIP");
        new Input(driver, "Shipping Country").write("testCountry");

        new Select(driver, "Industry").select("Construction");
        new Select(driver, "Type").select("Press");

        new TextArea(driver, "Description").fill("testDescription");
        new TextArea(driver, "Billing Street").fill("testBillingStreet");
        new TextArea(driver, "Shipping Street").fill("testShippingStreet");

        driver.findElement(SAVE_BUTTON).click();
        driver.findElement(By.xpath(String.format(createdAccount, accountName)));
        return new AccountsPage(driver);
    }
}
