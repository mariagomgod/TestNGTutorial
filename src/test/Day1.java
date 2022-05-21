package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {

    @Test
    public void Demo() {
        System.out.println("hello");
        Assert.assertTrue(false);
    }

    @Test
    public void SecondTest() {
        System.out.println("Bye");
    }

    @AfterTest
    public void lastExecution() {

        System.out.println("I will execute last");
    }

    @AfterSuite
    public void afterSuite() {

        System.out.println("I am the last number 1");
    }
}
