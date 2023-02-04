import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

@Test
    public void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        String title = driver.getTitle();
        Assert.assertEquals("XYZ Bank", title);

    }
}

/*package com.livejournal;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() {
        driver.get("https://m.livejournal.com/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("LiveJournal"));

        WebElement button = driver.findElement(new By.ByXPath("//*[@id='js']/body/div[1]/div[1]/div[2]/div/a"));
       button.click();

       WebElement inputLogin = driver.findElement(new By.ByXPath("//*[@id='login']"));
       inputLogin.click();
       inputLogin.sendKeys("syneltest");

       WebElement inputPassword = driver.findElement(new By.ByXPath("//*[@id='password']"));
       inputPassword.click();
       inputPassword.sendKeys("123qweASD");

       WebElement ligIn = driver.findElement(new By.ByXPath("//*[@id='js']/body/div[1]/div[2]/div/div/form/div[4]/input[1]"));
       ligIn.click();
       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

       WebElement newPost = driver.findElement(new By.ByXPath("//*[@id='js']/body/div[2]/div[1]/table/tbody/tr/td[1]/a"));
       newPost.click();

       WebElement inputHeader = driver.findElement(new By.ByXPath("//*[@id='update-theme']"));
       inputHeader.click();
       inputHeader.sendKeys("Hello world!");

       WebElement inputBody = driver.findElement(new By.ByXPath("//*[@id='update-post']"));
       inputBody.click();
       inputBody.sendKeys("Have a nice day everyone who reads this");


       WebElement share = driver.findElement(new By.ByXPath("//*[@id='js']/body/div[2]/div[2]/form/p[7]/input[1]"));
       share.click();





    }

}*/