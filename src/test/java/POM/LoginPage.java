package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
WebDriver driver;

By Header=By.xpath("//h2");
By Username=By.name("uid");
By Password=By.name("password");
By Submit=By.name("btnLogin");
String URL=("https://www.demo.guru99.com/V4/");

public LoginPage(WebDriver driver) {
	this.driver=driver;
}

public void VerifyHeader() {
	String GetHeaderText=driver.findElement(Header).getText();
	Assert.assertEquals(GetHeaderText, "Guru99 Bank", "Not Matching");
}

public void URL() {
	driver.get(URL);
}

public void VerifyLogin() {
	driver.findElement(Username).sendKeys("mngr26593");
	driver.findElement(Password).sendKeys("12!@");
	driver.findElement(Submit).click();
}
}
