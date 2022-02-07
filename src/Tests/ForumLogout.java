package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumLogout {
    private static final String LOGOUT_BUTTON_XPATH = "//body/div[@id='header']/nav[@id='navigation']/li[9]/a[1]";

    public static WebElement getLogout(WebDriver driver) {
        return driver.findElement(By.xpath(LOGOUT_BUTTON_XPATH));
    }

    public static void clickLogout(WebDriver driver) {
        getLogout(driver).click();
    }

}
