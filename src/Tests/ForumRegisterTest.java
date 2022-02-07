package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ForumRegisterTest {

    @Test
    void ForumRegisterTest1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srele\\Desktop\\Selenijum\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\Srele\\Desktop\\Selenijum\\extension_4_24_0_0.crx"));

//        potencijalni inkognito rezim
//        options.addArguments("incognito");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);

        WebDriver driver = new ChromeDriver(options);
        String url = "https://www.mycity.rs/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // ukoliko nije na odgovarajucoj stranici posalji ga na pravu
        if (!driver.getCurrentUrl().equals(url)) {
            driver.navigate().to(url);
        }

        ForumRegister.getRegisterButton(driver);
        ForumRegister.clickRegisterButton(driver);

        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        ForumRegister.getName(driver);
        ForumRegister.clickName(driver);
        ForumRegister.inputName(driver, "Bobby Marjan");

        ForumRegister.getEmail(driver);
        ForumRegister.clickEmail(driver);
        ForumRegister.inputEmail(driver, "wladlam@ipyzqshop.com");

        ForumRegister.getPassword(driver);
        ForumRegister.clickPassword(driver);
        ForumRegister.inputPassword(driver, "Blabla123");

        ForumRegister.getConfirmPassword(driver);
        ForumRegister.clickConfirmPassword(driver);
        ForumRegister.inputConfirmPassword(driver, "Blabla123");

        //scroll
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)");

        ForumRegister.getSubmit(driver);
        ForumRegister.clickSubmit(driver);

//        if (driver.getCurrentUrl().equals("https://www.mycity.rs/profile.php"))
//            System.out.println("Test je uspesan! Uspesno smo se registrovali :) ");
//        else {
//            System.out.println("Test je neuspesan! Neuspesno smo se registrovali! ");
//        }

        boolean result;
        result = ForumLogIn.ValidateURL(driver, "https://www.mycity.rs/profile.php");
        //ocekujem da mi se vrati true jer ocekujem da bude na istoj stranici
        //u zagradi je actual
        Assert.assertTrue(result, "Greska! Url koji smo dobili se ne poklapa sa ocekivanim");

        driver.quit();

    }
}
