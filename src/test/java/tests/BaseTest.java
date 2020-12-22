package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {
    public final static String USERNAME = "stiffler88-caje@force.com";
    public final static String PASSWORD = "St5777758";

    WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;
    NewAccountModal newAccountModal;
    AccountsPage accountsPage;
    ContactsPage contactsPage;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        newAccountModal = new NewAccountModal(driver);
        accountsPage = new AccountsPage(driver);
        contactsPage = new ContactsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.quit();
    }
}
