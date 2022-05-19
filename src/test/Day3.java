package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day3 {

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

    @AfterTest
    public void lastExecution() {
        System.out.println("I will execute last");
    }
}
