package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumSearch {
    private static final String SEARCH_XPATH = "//body/div[@id='header']/nav[@id='navigation']/li[7]/a[1]";
    private static final String SEARCH_FIELD_XPATH = "//tbody/tr[1]/td[2]/input[1]";
    private static final String SEARCH_BUTTON_XPATH = "//body[1]/div[6]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[7]/th[1]/input[1]";

    public static WebElement getSearch(WebDriver driver) {
        return driver.findElement(By.xpath(SEARCH_XPATH));
    }

    public static void clickSearch(WebDriver driver) {
        getSearch(driver).click();
    }

    public static WebElement getSearchField(WebDriver driver) {
        return driver.findElement(By.xpath(SEARCH_FIELD_XPATH));
    }

    public static void clickSearchField(WebDriver driver) {
        getSearchField(driver).click();
    }

    public static void inputSearchField(WebDriver driver, String data) {
        getSearchField(driver).sendKeys(data);
    }

    public static WebElement getSearcButton(WebDriver driver) {
        return driver.findElement(By.xpath(SEARCH_BUTTON_XPATH));
    }

    public static void clickSearchButton(WebDriver driver) {
        getSearcButton(driver).click();
    }

}

