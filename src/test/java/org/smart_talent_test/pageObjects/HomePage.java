package org.smart_talent_test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
//    Variable para almacenar la información de elemento web
//    que se requiere buscar.
    private  WebElement element_page;

//    Método que realiza la búsdqueda y retorna el elemeto.
    public  WebElement buttonMyAppoiment(WebDriver driver) {

        element_page = driver.findElement(By.id("btn-make-appointment"));
        return element_page;

    }

}
