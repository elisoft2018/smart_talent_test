package org.smart_talent_test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

//    Variable para almacenar la información de los elementos web
//    que se requieren buscar.

    private WebElement element_page;

//        Métodos que realiza la búsdqueda y retorna cada uno de los
//        elementos de la pagina.
    public WebElement textUserName(WebDriver driver) {

        element_page = driver.findElement(By.id("txt-username"));
        return element_page;
    }

    public WebElement textPassword(WebDriver driver) {

        element_page = driver.findElement(By.id("txt-password"));
        return element_page;
    }

    public WebElement buttonLogin(WebDriver driver) {

        element_page = driver.findElement(By.id("btn-login"));
        return element_page;
    }
}
