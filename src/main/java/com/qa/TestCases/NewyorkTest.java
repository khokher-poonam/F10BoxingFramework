package com.qa.TestCases;

import com.qa.Base.Baseclass;
import com.qa.pages.NewyorkPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewyorkTest extends Baseclass {

    NewyorkPage newyorkPage=new NewyorkPage();
    public  NewyorkTest()
    {
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        newyorkPage=new NewyorkPage();
    }
    @Test
    public void newyorkbutton() throws InterruptedException {
        newyorkPage.setViewAllBtn();
        Thread.sleep(2000);
    }
}
