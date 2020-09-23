package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openPage() {
        driver.get("https://um6.lightning.force.com/lightning/page/home");
        return this;
    }

    @Step("Create new Account")
    public AccountsPage goToAccounts() {
        driver.get("https://um6.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        return new AccountsPage(driver);
    }

    @Step("Create new Contact")
    public ContactsPage goToContacts() {
        driver.get("https://um6.lightning.force.com/lightning/o/Contact/home");
        return new ContactsPage(driver);
    }
}
