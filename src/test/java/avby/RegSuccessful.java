package avby;

import avby.pageObject.RegPage;
import framework.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegSuccessful extends BaseTest {
    @Test
    public void reg() {
        RegPage loginPage = new RegPage();
        RegPage.navigateLoginPage("Войти");
        RegPage.navigateSpan();
        RegPage.inPutName();
        RegPage.inPutMail();
        RegPage.inPutPassword();
        RegPage.clickCheckBox();
        RegPage.clickReg();
    }
}