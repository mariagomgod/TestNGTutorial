package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

    @BeforeSuite
    public void beforeSuite() {

        System.out.println("I am number 1");
    }

    @BeforeMethod
    public void beforeMethod() {

        System.out.println("I will execute before every test method in day 3 class");
    }

    @Test
    public void WebLoginCarLoan() {

        //Selenium
        System.out.println("WebLoginCar");
    }

    @Test
    public void MobileLoginCarLoan() {

        //Appium
        System.out.println("MobileLoginCar");
    }

    @Test
    public void loginAPICarLoan() {

        //Rest API automation
        System.out.println("APILoginCar");
    }

    @AfterMethod
    public void afterMethod() {

        System.out.println("I will execute after every test method in day 3 class");
    }
}
