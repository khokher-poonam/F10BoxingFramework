package com.qa.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

    public static void main (String[]args) {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://yopmail.com/en/");
        String currentPageURL=driver.getTitle();
        System.out.println("current page" +currentPageURL);
        WebElement loginInput= driver.findElement(By.id("login"));
        loginInput.sendKeys("poonam");
        loginInput.submit();
        String LoginpageURL=driver.getTitle();
        System.out.println("after login"+LoginpageURL);
        if(currentPageURL.contentEquals(LoginpageURL))
        {
            System.out.println("url is");
        }
        else {
            System.out.println("url is not matching");

        }


    }
}
