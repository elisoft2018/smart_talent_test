package org.smart_talent_test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebElement element_page;
//    private static WebElement password;
//    private static WebElement login_button;

    public static WebElement TextUserName(WebDriver driver) {

        element_page = driver.findElement(By.id("txt-username"));
        return element_page;
    }

    public static WebElement TextPassword(WebDriver driver) {

        element_page = driver.findElement(By.id("txt-password"));
        return element_page;
    }

    public static WebElement Buttonlogin(WebDriver driver) {

        element_page = driver.findElement(By.id("btn-login"));
        return element_page;
    }
}
