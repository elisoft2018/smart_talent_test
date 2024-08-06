package org.smart_talent_test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private static WebElement element_page;

    public static WebElement buttonMyAppoiment(WebDriver driver) {

        element_page = driver.findElement(By.id("btn-make-appointment"));
        return element_page;
    }
}
