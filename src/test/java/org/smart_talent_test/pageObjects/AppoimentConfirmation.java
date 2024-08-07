package org.smart_talent_test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppoimentConfirmation {

//    Variable para almacenar la información de elemento web
//    que se requiere buscar.
    private WebElement element_page;

//    Método que realiza la búsdqueda y retorna el elemeto.


    public WebElement facility(WebDriver driver) {

        element_page=driver.findElement(By.id("facility"));
        return element_page;
    }

    public WebElement hospitalReadmission(WebDriver driver) {

        element_page=driver.findElement(By.id("hospital_readmission"));
        return element_page;
    }

    public WebElement healthCareProgram(WebDriver driver) {

        element_page=driver.findElement(By.id("program"));
        return element_page;
    }

    public WebElement visitDate(WebDriver driver) {

        element_page=driver.findElement(By.id("visit_date"));
        return element_page;
    }

    public WebElement comment(WebDriver driver) {

        element_page=driver.findElement(By.id("comment"));
        return element_page;
    }

    public WebElement backToHomePage(WebDriver driver) {

        element_page = driver.findElement(By.cssSelector(".btn-default"));
        return element_page;

    }

}
