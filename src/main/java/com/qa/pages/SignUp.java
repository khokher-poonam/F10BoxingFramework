package com.qa.pages;

import com.qa.Base.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
    WebDriver driver;
    @FindBy(xpath="//input[@id='email']")
    WebElement email;
    @FindBy(xpath="//input[@id='password']")
    WebElement password;
    @FindBy(xpath="//input[@id='confirm-password']")
    WebElement confirmpassword;
    @FindBy(xpath="//input[@id='first_name']")
    WebElement firstname;
    @FindBy(xpath="//input[@id='last_name']")
    WebElement lastname;
    @FindBy(xpath="//input[@name='Phone']")
    WebElement Phone;
    @FindBy(xpath="//button[@id='location']")
    WebElement location;
    @FindBy(xpath="//input[@id='affiliate_id']")
    WebElement affiliateid;
@FindBy(xpath="//input[@type='checkbox']")
WebElement checkbox;
    @FindBy(xpath="//button[contains(text(),'Continue')]")
    WebElement continuebtn;
public SignUp()
{
    this.driver= Baseclass.driver;
    PageFactory.initElements(driver,this);
}
public void verifyEmail()
{
    email.sendKeys("abc@gmail.com");
}
public void verifyPwd()
{
    password.sendKeys("12345667");
}
    public void setConfirmpassword()
    {
        confirmpassword.sendKeys("12345667");

    }
    public void setFirstname()
    {
        firstname.sendKeys("poonam");

    }
    public void setLastname()
    {
        lastname.sendKeys("khokher");

    }
    public void setPhone()
    {
        Phone.sendKeys("123445567");

    }
    public void setLocation()
    {
        Select select=new Select(location);
        select.selectByValue("Brooklyn");
    }
    public void setAffiliateid()
    {
        affiliateid.sendKeys("123445567");

    }
    public  void setCheckbox()
    {
        checkbox.click();

    }
public  void clickContinueBtn()
{
    continuebtn.click();

}
}
