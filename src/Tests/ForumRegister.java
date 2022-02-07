package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumRegister {
    private static final String REGISTER_BUTTON_XPATH = "//body/div[@id='header']/nav[@id='navigation']/li[3]/a[1]";
    private static final String NAME_FIELD_ID = "username_reg";
    private static final String EMAIL_FIELD_ID = "email_reg";
    private static final String PASSWORD_FIELD_ID = "pass1_reg";
    private static final String CONFIRM_PASSWORD_FIELD_ID = "pass2_reg";
    private static final String SUBMIT_XPATH = "//tbody/tr[2]/td[1]/form[1]/div[6]/span[1]/button[1]";

    public static WebElement getRegisterButton(WebDriver driver) {
        return driver.findElement(By.xpath(REGISTER_BUTTON_XPATH));
    }

    public static void clickRegisterButton(WebDriver driver) {
        getRegisterButton(driver).click();
    }

    public static WebElement getName(WebDriver driver) {
        return driver.findElement(By.id(NAME_FIELD_ID));
    }

    public static void clickName(WebDriver driver) {
        getName(driver).click();
    }

    public static void inputName(WebDriver driver, String data) {
        getName(driver).sendKeys(data);
    }

    public static WebElement getEmail(WebDriver driver) {
        return driver.findElement(By.id(EMAIL_FIELD_ID));
    }

    public static void clickEmail(WebDriver driver) {
        getEmail(driver).click();
    }

    public static void inputEmail(WebDriver driver, String data) {
        getEmail(driver).sendKeys(data);
    }

    public static WebElement getPassword(WebDriver driver) {
        return driver.findElement(By.id(PASSWORD_FIELD_ID));
    }

    public static void clickPassword(WebDriver driver) {
        getPassword(driver).click();
    }

    public static void inputPassword(WebDriver driver, String data) {
        getPassword(driver).sendKeys(data);
    }

    public static WebElement getConfirmPassword(WebDriver driver) {
        return driver.findElement(By.id(CONFIRM_PASSWORD_FIELD_ID));
    }

    public static void clickConfirmPassword(WebDriver driver) {
        getConfirmPassword(driver).click();
    }

    public static void inputConfirmPassword(WebDriver driver, String data) {
        getConfirmPassword(driver).sendKeys(data);
    }

    public static WebElement getSubmit(WebDriver driver) {
        return driver.findElement(By.xpath(SUBMIT_XPATH));
    }

    public static void clickSubmit(WebDriver driver) {
        getSubmit(driver).click();
    }

}