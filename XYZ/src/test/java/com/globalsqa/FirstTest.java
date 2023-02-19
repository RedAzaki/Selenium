package com.globalsqa;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest extends WebDriverSettings{

    @Test
    public void firstTest() {

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        String title = driver.getTitle();
        Assert.assertEquals("XYZ Bank", title);

        WebElement button = driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-lg'])[1]"));
        button.click();

        WebElement inputLogin = driver.findElement(By.xpath("//div[@class='form-group']"));
        inputLogin.click();

        WebElement choisName = driver.findElement(By.xpath("//option[@value='1']"));
        choisName.click();



    }
}

