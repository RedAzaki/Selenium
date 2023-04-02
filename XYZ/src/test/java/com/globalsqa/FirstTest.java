package com.globalsqa;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends WebDriverSettings {

    @Test
     public void firstTest() {

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        String title = driver.getTitle();
        Assert.assertEquals("XYZ Bank", title);

        //Заголовок страницы
        boolean header = driver.findElement(By.cssSelector("strong[class='mainHeading']")).isDisplayed();
        //кнопка Домой
        WebElement btnHome = driver.findElement(By.cssSelector("button[class='btn home']"));
        //кнопка Customer Login
        WebElement btnCustLog = driver.findElement(By.cssSelector("button[ng-click='customer()']"));
        //кнопка Bank Manager Login
        WebElement btnManLog = driver.findElement(By.cssSelector("button[ng-click='manager()']"));
        btnManLog.click();

        //Проверка кнопок в Bank Manager Login
        WebElement btnAddCust = driver.findElement(By.cssSelector("button[ng-click='addCust()']"));
        WebElement btnOpenAcc = driver.findElement(By.cssSelector("button[ng-click='openAccount()']"));
        WebElement btnCust = driver.findElement(By.cssSelector("button[ng-click='showCust()']"));

        //Добавляем пользователя
        btnAddCust.click();
        //Поле Имя
        WebElement inpFname = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        inpFname.sendKeys("Bear");//Сюда надо добавить генератор слов
        //Поле Фамилия
        WebElement inpLname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        inpLname.sendKeys("Pupkin");
        //Поле Пост код
        WebElement inpPosCod = driver.findElement(By.cssSelector("input[placeholder='Post Code']"));
        inpPosCod.sendKeys("78DDC9");

        //Кнопка добавить
        WebElement btnAdCust = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
         btnAdCust.click();


//








    }
}

