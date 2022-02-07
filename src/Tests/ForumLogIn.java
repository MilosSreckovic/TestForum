package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumLogIn {
    private static final String LOGIN_BUTTON_XPATH = "//body/div[@id='header']/nav[@id='navigation']/li[2]/a[1]";
    private static final String USERNAME_FIELD_XPATH = "//tbody/tr[1]/td[1]/form[1]/div[1]/label[1]/input[1]";
    private static final String PASSWORD_FIELD_XPATH = "//tbody/tr[1]/td[1]/form[1]/div[2]/label[1]/input[1]";
    private static final String LOG_IN_BUTTON_XPATH = "//tbody/tr[1]/td[1]/form[1]/div[4]/span[1]/button[1]";
    private static final String PROFILE_BUTTON_XPATH = "//body/div[@id='header']/nav[@id='navigation']/li[2]/a[1]";

    public static WebElement getLogin(WebDriver driver) {
        return driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
    }

    public static void clickLogin(WebDriver driver) {
        getLogin(driver).click();
    }

    public static WebElement getUsername(WebDriver driver) {
        return driver.findElement(By.xpath(USERNAME_FIELD_XPATH));
    }

    public static void clickUsername(WebDriver driver) {
        getUsername(driver).click();
    }

    public static void inputUsername(WebDriver driver, String data) {
        getUsername(driver).sendKeys(data);
    }

    public static WebElement getPassword(WebDriver driver) {
        return driver.findElement(By.xpath(PASSWORD_FIELD_XPATH));
    }

    public static void clickPassword(WebDriver driver) {
        getPassword(driver).click();
    }

    public static void inputPassword(WebDriver driver, String data) {
        getPassword(driver).sendKeys(data);
    }

    public static WebElement getLogIn(WebDriver driver) {
        return driver.findElement(By.xpath(LOG_IN_BUTTON_XPATH));
    }

    public static void clickLogIn(WebDriver driver) {
        getLogIn(driver).click();
    }

    public static WebElement getProfile(WebDriver driver) {
        return driver.findElement(By.xpath(PROFILE_BUTTON_XPATH));
    }

    public static void clickProfile(WebDriver driver) {
        getProfile(driver).click();
    }

    public static boolean ValidateURL(WebDriver driver, String expURL) {
        boolean result = false;
        //ako su razlicite vrednosti uporedi svakako
        if (driver.getCurrentUrl().equalsIgnoreCase(expURL)) {
            result = true;
        }
        return result;
    }
}


