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

public class ForumSearchTest {

    @Test
    void ForumSearchTest1() {
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

        ForumLogIn.getLogin(driver);
        ForumLogIn.clickLogin(driver);

        //scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        ForumLogIn.getUsername(driver);
        ForumLogIn.clickUsername(driver);
        ForumLogIn.inputUsername(driver, "Bobby37");

        ForumLogIn.getPassword(driver);
        ForumLogIn.clickPassword(driver);
        ForumLogIn.inputPassword(driver, "bobby3737");

        ForumLogIn.getLogIn(driver);
        ForumLogIn.clickLogIn(driver);

        ForumLogIn.getProfile(driver);
        ForumLogIn.clickProfile(driver);

        ForumSearch.getSearch(driver);
        ForumSearch.clickSearch(driver);

        //scroll
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,500)");
        ForumSearch.getSearchField(driver);
        ForumSearch.clickSearchField(driver);
        ForumSearch.inputSearchField(driver, "Fudbal");

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        ForumSearch.getSearcButton(driver);
        ForumSearch.clickSearchButton(driver);

//        if (driver.getCurrentUrl().equals("https://www.mycity.rs/search.php?mode=results"))
//            System.out.println("Test je uspesan! Uspesno smo pretrazili pojam :) ");
//        else {
//            System.out.println("Test je neuspesan! Neuspesno smo pretrazili pojam! ");
//        }

        boolean result;
        result = ForumLogIn.ValidateURL(driver, "https://www.mycity.rs/search.php?mode=results");
        //ocekujem da mi se vrati true jer ocekujem da bude na istoj stranici
        //u zagradi je actual
        Assert.assertTrue(result, "Greska! Url koji smo dobili se ne poklapa sa ocekivanim");

        driver.quit();

    }
}
