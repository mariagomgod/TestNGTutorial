package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
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

    @Parameters({"URL"})
    @Test
    public void WebLoginCarLoan(String urlName) {

        //Selenium
        System.out.println("WebLoginCar");
        System.out.println(urlName);
    }

    @Test(enabled = false)
    public void WebLoginSigInCarLoan() {

        //Selenium
        System.out.println("WebLoginSigInCar");
    }

    @Test(dataProvider = "getData")
    public void WebLoginSigOutCarLoan(String username, String password) {

        //Selenium
        System.out.println("WebLoginSigOutCar");
        System.out.println(username);
        System.out.println(password);
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

    @DataProvider
    public Object[] getData() {

        // 1st combination - username password - good credit history -row
        // 2nd combination - username password - no credit history
        // 3rd combination - fraudulent credit history
        Object [][] data = new Object[3][2];
        data [0][0] = "firstSetUsername";
        data [0][1] = "firstPassword";

        data [1][0] = "secondSetUsername";
        data [1][1] = "secondPassword";

        data [2][0] = "thirdSetUsername";
        data [2][1] = "thirdPassword";
        return new Object[0];
    }
}
