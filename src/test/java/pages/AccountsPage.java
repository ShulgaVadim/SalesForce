package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AccountsPage extends BasePage {

    String accountLocator = "//*[@class='scroller actionBarPlugin']//tbody//tr//span//a[text()=\"%s\"]";

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Create new Account")
    @Description("Click on New Account Button")
    public NewAccountModal clickOnNewAccount() {
        driver.findElement(By.cssSelector("[title=New]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='New Account']")));
        return new NewAccountModal(driver);
    }

    @Step("Validation of creating account")
    public void isAccountCreated(String accountName) {
        driver.get("https://ap16.lightning.force.com/lightning/o/Account/list?filterName=Recent");
        Assert.assertTrue(driver.findElement(By.xpath(String.format(accountLocator, accountName))).isDisplayed());
    }
}

