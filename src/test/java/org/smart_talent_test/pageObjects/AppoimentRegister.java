package org.smart_talent_test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppoimentRegister {

    private static WebElement element_page;

    public static WebElement listSiteAppoiment(WebDriver driver){

        element_page=driver.findElement(By.id("combo_facility"));
        return element_page;

    }

    public  static void selectOptionVisit(){
        Select select=new Select(element_page);
        select.selectByIndex(2);
    }

    public static WebElement checkAppoiment(WebDriver driver){

        element_page=driver.findElement(By.id("chk_hospotal_readmission"));
        return element_page;

    }

    public static WebElement radioButtonAppoiment(WebDriver driver){

        element_page=driver.findElement(By.id("radio_program_medicaid"));
        return element_page;
    }
    public static WebElement listSelecctionDateVisitAppoiment(WebDriver driver){

        element_page=driver.findElement(By.id("txt_visit_date"));
        return element_page;

    }

    public static WebElement textCommentAppoiment(WebDriver driver){

        element_page=driver.findElement(By.id("txt_comment"));
        return element_page;

    }

    public static WebElement buttonAppoiment(WebDriver driver){

        element_page=driver.findElement(By.id("btn-book-appointment"));
        return element_page;

    }

}
