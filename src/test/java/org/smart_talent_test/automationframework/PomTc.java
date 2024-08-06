package org.smart_talent_test.automationframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.smart_talent_test.pageObjects.AppoimentRegister;
import org.smart_talent_test.pageObjects.HomePage;
import org.smart_talent_test.pageObjects.LoginPage;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PomTc {

    private static WebDriver driver = null;
    private static Date date = null;


    public static void main(String[] args) {

        date = new Date();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        HomePage.buttonMyAppoiment(driver).click();
        LoginPage.TextUserName(driver).sendKeys("John Doe");
        LoginPage.TextPassword(driver).sendKeys("ThisIsNotAPassword");
        LoginPage.Buttonlogin(driver).click();
        AppoimentRegister.listSiteAppoiment(driver).click();
        AppoimentRegister.selectOptionVisit();
        AppoimentRegister.checkAppoiment(driver).click();
        AppoimentRegister.radioButtonAppoiment(driver).click();
        AppoimentRegister.listSelecctionDateVisitAppoiment(driver).sendKeys(date.toString());
        AppoimentRegister.textCommentAppoiment(driver).sendKeys("Ninguna observación");
        AppoimentRegister.buttonAppoiment(driver).click();


    }
}
