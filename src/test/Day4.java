package test;

import org.testng.annotations.Test;

public class Day4 {

    @Test
    public void WebLoginHomeLoan() {

        //Selenium
        System.out.println("WebLoginHome");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginHomeLoan() {

        //Appium
        System.out.println("MobileLoginHome");
    }

    @Test
    public void loginAPIHomeLoan() {

        //Rest API automation
        System.out.println("APILoginHome");
    }
}
