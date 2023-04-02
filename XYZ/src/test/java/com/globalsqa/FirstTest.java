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

        //��������� ��������
        boolean header = driver.findElement(By.cssSelector("strong[class='mainHeading']")).isDisplayed();
        //������ �����
        WebElement btnHome = driver.findElement(By.cssSelector("button[class='btn home']"));
        //������ Customer Login
        WebElement btnCustLog = driver.findElement(By.cssSelector("button[ng-click='customer()']"));
        //������ Bank Manager Login
        WebElement btnManLog = driver.findElement(By.cssSelector("button[ng-click='manager()']"));
        btnManLog.click();

        //�������� ������ � Bank Manager Login
        WebElement btnAddCust = driver.findElement(By.cssSelector("button[ng-click='addCust()']"));
        WebElement btnOpenAcc = driver.findElement(By.cssSelector("button[ng-click='openAccount()']"));
        WebElement btnCust = driver.findElement(By.cssSelector("button[ng-click='showCust()']"));

        //��������� ������������
        btnAddCust.click();
        //���� ���
        WebElement inpFname = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        inpFname.sendKeys("Bear");//���� ���� �������� ��������� ����
        //���� �������
        WebElement inpLname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        inpLname.sendKeys("Pupkin");
        //���� ���� ���
        WebElement inpPosCod = driver.findElement(By.cssSelector("input[placeholder='Post Code']"));
        inpPosCod.sendKeys("78DDC9");

        //������ ��������
        WebElement btnAdCust = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
         btnAdCust.click();


//








    }
}

