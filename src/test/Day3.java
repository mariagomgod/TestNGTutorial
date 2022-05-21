package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

    @BeforeClass
    public void beforeClass() {

        System.out.println("Before executing any methods in the class");
    }

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

    @Test(enabled = false)
    public void WebLoginSigInCarLoan() {

        //Selenium
        System.out.println("WebLoginSigInCar");
    }

    @Test(timeOut = 4000)
    public void WebLoginSigOutCarLoan() {

        //Selenium
        System.out.println("WebLoginSigOutCar");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan() {

        //Appium
        System.out.println("MobileLoginCar");
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan", "MobileLoginCarLoan"})
    public void loginAPICarLoan() {

        //Rest API automation
        System.out.println("APILoginCar");
    }

    @AfterMethod
    public void afterMethod() {

        System.out.println("I will execute after every test method in day 3 class");
    }

    @AfterClass
    public void afterClass() {

        System.out.println("After executing all methods in the class");
    }
}
