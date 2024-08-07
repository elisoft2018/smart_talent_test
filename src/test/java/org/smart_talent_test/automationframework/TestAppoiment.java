package org.smart_talent_test.automationframework;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.smart_talent_test.pageObjects.AppoimentConfirmation;
import org.smart_talent_test.pageObjects.AppoimentRegister;
import org.smart_talent_test.pageObjects.HomePage;
import org.smart_talent_test.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestAppoiment {
    private String send_facility;
    private String send_check;
    private String send_healthcareProgram;
    private String send_visitDate;
    private String send_comment;
    private WebDriver driver;
    private Date date;
    private String url = "https://katalon-demo-cura.herokuapp.com/";

    @BeforeTest
    public void before() {
        driver = new ChromeDriver();
        date = new Date();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        System.out.println("Antes del Test");
    }
    @AfterTest
    public void after() throws Exception {
        driver.quit();
        report();
        System.out.println("Despues del Test");
    }


    @Test(priority = 1)
    @Order(1)
    public void testHome() {

        HomePage homePage = new HomePage();
        if (homePage.buttonMyAppoiment(driver).isDisplayed()) {

            homePage.buttonMyAppoiment(driver).click();

        } else {

            System.out.println("No se encontró el elemento");
        }

    }

    @Test(priority = 2)
    @Order(2)
    public void testLoginSucces() {

        LoginPage loginPage = new LoginPage();
        loginPage.textUserName(driver).sendKeys("John Doe");
        loginPage.textPassword(driver).sendKeys("ThisIsNotAPassword");
        loginPage.buttonLogin(driver).click();
    }

    @Test(priority = 3)
    @Order(3)
    public void testAppoimentRegister() {

        AppoimentRegister appoimentRegister = new AppoimentRegister();
        appoimentRegister.dropDownFacility(driver).click();
        appoimentRegister.selectOptionFacility();
        send_facility = appoimentRegister.dropDownFacility(driver).getText();
        appoimentRegister.checkAppoiment(driver).click();
        send_check = appoimentRegister.checkAppoiment(driver).getText();
        appoimentRegister.radioButtonHealthcareProgram(driver).click();
        send_healthcareProgram = appoimentRegister.radioButtonHealthcareProgram(driver).getText();
        appoimentRegister.listVisitDate(driver).sendKeys(date.toString());
        send_visitDate = appoimentRegister.listVisitDate(driver).getText();
        appoimentRegister.textComments(driver).sendKeys("Pruebas Smart Talent");
        send_comment = appoimentRegister.textComments(driver).getText();
        appoimentRegister.buttonAppoiment(driver).click();

    }

    @Test(priority = 4)
    @Order(4)
    public void confirmationAppoint() {

        AppoimentConfirmation appoimentConfirmation = new AppoimentConfirmation();
        String registered_facility = appoimentConfirmation.facility(driver).getText();
        String registered_check = appoimentConfirmation.hospitalReadmission(driver).getText();
        String registered_healthcareProgram = appoimentConfirmation.healthCareProgram(driver).getText();
        String registered_visitDate = appoimentConfirmation.visitDate(driver).getText();
        String registered_comment = appoimentConfirmation.comment(driver).getText();

        Assert.assertEquals(registered_facility, send_facility);
        Assert.assertEquals(registered_check, send_check);
        Assert.assertEquals(registered_healthcareProgram, send_healthcareProgram);
        Assert.assertEquals(registered_visitDate, send_visitDate);
        Assert.assertEquals(registered_comment, send_comment);
    }

    public void report() throws Exception {
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \" cd C:\\Users\\johne\\IdeaProjects\\smart_talent_test && mvn allure:serve");
    }
}
