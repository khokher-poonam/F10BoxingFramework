package com.qa.pages;

import com.qa.Base.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//ul[@class='wsite-menu-default']//a[contains(text(),'Schedule')]")
    WebElement schedule;
    @FindBy(xpath = "//ul[@class='wsite-menu-default']//a[contains(text(),'On Demand')]")
    WebElement ondemand;
    @FindBy(xpath="//div[@class='wsite-menu-wrap']//li[@id='wsite-nav-543805881701488296']//span[@class='wsite-menu-title'][normalize-space()='New York']")
    WebElement newyork;
    @FindBy(xpath = "//div[@class='wsite-menu-wrap']//span[@class='wsite-menu-title'][normalize-space()='New Delhi']")
    WebElement newdelhi;
@FindBy(xpath = "//ul[@class='wsite-menu-default']//a[@class='wsite-menu-item'][normalize-space()='Signup']")
WebElement signup;
    public HomePage()
    {
        this.driver= Baseclass.driver;
        PageFactory.initElements(driver,this);
    }

    public  String validateTitle()
    {
        return driver.getTitle();

    }
    public  SchedulePage clickschedule()
    {
        schedule.click();
        return new SchedulePage();
    }
    public NewyorkPage clickNewyorkLink() throws InterruptedException {
        this.ondemand.click();
        Actions actions=new Actions(driver);
        actions.moveToElement(newyork).click().build().perform();
        Thread.sleep(5000);
        return  new NewyorkPage();
    }
    public NewDelhi  clickDelhiLink() throws InterruptedException {
        this.ondemand.click();
        Actions actions=new Actions(driver);
        actions.moveToElement(newdelhi).click().build().perform();
        Thread.sleep(2000);
        return  new NewDelhi();
    }

public SignUp clickSignup()
{
    signup.click();
    return new SignUp();
}

}