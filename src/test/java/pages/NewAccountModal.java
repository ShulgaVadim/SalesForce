package pages;

import elements.Input;
import elements.Select;
import elements.TextArea;
import modals.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountModal {
    WebDriver driver;
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");
    String createdAccount = "//span[text()='%s']";

    public NewAccountModal(WebDriver driver) {
        this.driver = driver;
    }

    public AccountsPage createAccount(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getBillingState());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getShippingState());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getBillingCountry());

        new Select(driver, "Industry").select(account.getIndustry());
        new Select(driver, "Type").select(account.getType());

        new TextArea(driver, "Description").fill(account.getDescription());
        new TextArea(driver, "Billing Street").fill(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").fill(account.getShippingStreet());

        driver.findElement(SAVE_BUTTON).click();
        driver.findElement(By.xpath(String.format(createdAccount, account.getAccountName())));
        return new AccountsPage(driver);
    }
}
