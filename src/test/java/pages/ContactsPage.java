package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactsPage extends BasePage {

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Create new Contact")
    @Description("Click on New Contact Button")
    public NewContactModal clickOnNewContact() {
        driver.findElement(By.cssSelector("[title=New]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='New Contact']")));
        return new NewContactModal(driver);
    }
}