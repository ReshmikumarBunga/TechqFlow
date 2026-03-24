package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNGDemo {
	WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println(">> Before Suite: Setup global test environment");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(">> After Suite: Cleanup global test environment");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println(">> Before Test: Setup test-specific configuration");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(">> After Test: Teardown test-specific configuration");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(">> Before Class: Setup for BasicTestNGDemo class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(">> After Class: Teardown for BasicTestNGDemo class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println(">> Before Method: Open browser");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println(">> After Method: Close browser");
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testGoogleSearch() {
        System.out.println(">> Test: Open Google homepage");
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        assert title.contains("Google");
    }
}
