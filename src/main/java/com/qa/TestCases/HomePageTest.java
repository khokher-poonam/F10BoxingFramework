package com.qa.TestCases;

import com.qa.Base.Baseclass;
import com.qa.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePageTest extends Baseclass {
    WebDriver driver;
    Baseclass bs=new Baseclass();
    HomePage homePage=new HomePage();
    SchedulePage schedulePage=new SchedulePage();
    NewyorkPage newyorkPage=new NewyorkPage();
    NewDelhi newDelhi=new NewDelhi();
    SignUp signUp=new SignUp();
    public HomePageTest()
    {
        super();
    }
@BeforeSuite
    public void setUp()  {
        initialization();
        driver=bs.driver;
        homePage=new HomePage();
    }

    @Test(priority = 1)
    public void verifyTitle()
    {
        String title=homePage.validateTitle();
        Assert.assertEquals(title,"F10 Boxing Stage - Home","The homepage title is");
        System.out.println("F10 Boxing title is True");

    }
    @Test(priority = 5)
    public  void setSchedulePage()
    {
       schedulePage= homePage.clickschedule();
    }
    @Test(priority = 2)
    public void newYorkPage() throws InterruptedException {
        newyorkPage=homePage.clickNewyorkLink();
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void newDelhiPage() throws InterruptedException {
        newDelhi=homePage.clickDelhiLink();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void setSignUp()
    {
        signUp=homePage.clickSignup();
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

}
