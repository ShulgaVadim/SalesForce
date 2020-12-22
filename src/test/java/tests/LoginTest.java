package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void correctLogin() {
        loginPage
                .openPage()
                .login(USERNAME, PASSWORD);
        Assert.assertEquals(driver.getCurrentUrl(), "https://um6.lightning.force.com/lightning/page/home");
    }
}
