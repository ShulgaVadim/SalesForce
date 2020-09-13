package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openPage() {
        driver.get("https://um6.lightning.force.com/lightning/page/home");
        return this;
    }

    public AccountsPage goToAccounts() {
        driver.get("https://um6.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        return new AccountsPage(driver);
    }

    public ContactsPage goToContacts() {
        driver.get("https://um6.lightning.force.com/lightning/o/Contact/home");
        return new ContactsPage(driver);
    }
}
