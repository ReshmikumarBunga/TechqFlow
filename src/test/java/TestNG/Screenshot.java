package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.skoda-auto.co.in/models/kushaq/kushaq///");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Kushaq"));
		TakesScreenshot Ts=(TakesScreenshot)driver;
		File LoginPage=Ts.getScreenshotAs(OutputType.FILE);
		File LoginTrg=new File("C:\\Users\\Administrator\\eclipse-workspace\\TechqFlow\\Screenshots\\Skoda.jpeg");
		FileUtils.copyFile(LoginPage, LoginTrg);
		

	}

}
