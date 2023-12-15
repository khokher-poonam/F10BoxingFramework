package com.qa.pages;

import com.qa.Base.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewyorkPage extends  Baseclass{

    WebDriver driver;
    @FindBy(xpath = "//div[@class='App']//div[2]//div[1]//span[2]")
    WebElement viewAllBtn;

    public NewyorkPage()
    {
        this.driver= Baseclass.driver;
        PageFactory.initElements(driver,this);
    }
    public NewyorkPage setViewAllBtn()
    {
        viewAllBtn.click();
        return this;
    }
}
