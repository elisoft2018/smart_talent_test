package org.smart_talent_test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppoimentRegister {

//    Variable para almacenar la información de elemento web
//    que se requiere buscar.
    private WebElement element_page;

//        Métodos que realiza la búsdqueda y retorna cada uno de los
//        elementos de la pagina.

    public WebElement dropDownFacility(WebDriver driver){

        element_page = driver.findElement(By.name("facility"));
        return element_page;

    }

    public void selectOptionFacility(){
        Select select=new Select(element_page);
        select.selectByIndex(2);
    }

    public WebElement checkAppoiment(WebDriver driver){

        element_page=driver.findElement(By.id("chk_hospotal_readmission"));
        return element_page;

    }

    public WebElement radioButtonHealthcareProgram(WebDriver driver){

        element_page=driver.findElement(By.id("radio_program_medicaid"));
        return element_page;
    }

    public WebElement listVisitDate(WebDriver driver){

        element_page=driver.findElement(By.id("txt_visit_date"));
        return element_page;

    }

    public WebElement textComments(WebDriver driver){

        element_page=driver.findElement(By.id("txt_comment"));
        return element_page;

    }

    public WebElement buttonAppoiment(WebDriver driver){

        element_page=driver.findElement(By.id("btn-book-appointment"));
        return element_page;

    }

}
