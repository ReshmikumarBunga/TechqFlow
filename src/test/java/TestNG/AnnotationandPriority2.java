package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationandPriority2 {
	WebDriver driver;
	@Test(priority=1)
	void OpenApp(){
		driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/V4/");
	    driver.manage().window().maximize();
	}
	@Test(priority=2,dependsOnMethods = {"OpenApp"},dataProvider = "DP")
	void Login(String Email,String PWD) {
		driver.findElement(By.name("uid")).sendKeys(Email);
	    driver.findElement(By.name("password")).sendKeys(PWD);
	    driver.findElement(By.name("btnLogin")).click();
	}
	@Test(priority=3,dependsOnMethods = {"Login"})
	void Search() {
		System.out.println("This is search");
	}
	@Test(priority=4,dependsOnMethods = {"OpenApp"})
	void CloseApp() {
		driver.close();
	}
@DataProvider (name="DP")
String[][] Login()
{
	String data[][]= {
			{"abc@gmail.com","123"},
			{"maghu@yahoo.com","9876"},
			{"mngr26593","12!@"}
	}; return data;
}
}
	
