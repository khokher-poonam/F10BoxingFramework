package com.qa.TestCases;

import com.qa.Base.Baseclass;
import com.qa.pages.HomePage;
import com.qa.pages.SignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
public class SignUpTest  {
    WebDriver driver;
    SignUp signUp;
    HomePage homePage;
Baseclass bs;

    @BeforeClass
    public  void setUp() {
        Baseclass bs=new Baseclass();
       bs.initialization();
        homePage=new HomePage();
         signUp=new SignUp();
       signUp= homePage.clickSignup();

 }
    @Test
    public void login_details() throws InterruptedException {
        Thread.sleep(3000);

       bs.driver.switchTo().frame("studioyou-iframe");

//        WebDriverWait wait=new WebDriverWait(driver,10);
//                wait.until(ExpectedConditions.elementToBeClickable(By.id("verifyEmail")));
        signUp.verifyEmail();
        signUp.verifyPwd();
        signUp.setConfirmpassword();
        signUp.setFirstname();
        signUp.setLastname();
        signUp.setAffiliateid();
        signUp.setPhone();
        signUp.setLocation();
        signUp.setCheckbox();
        signUp.clickContinueBtn();
    }
@AfterClass
    public void tearDown()
{
    driver.quit();
}
}
