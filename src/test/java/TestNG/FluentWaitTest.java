package TestNG;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class FluentWaitTest {

	public static void main(String[] args) {
		// Set up WebDriver (Make sure to specify your own path here)
        //System.setProperty("webdriver.chrome.driver", "yourPath/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://demoqa.com/dynamic-properties");

     // FluentWait configure చేయండి
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))  // Max 30 sec wait
                .pollingEvery(Duration.ofSeconds(5))  // Every 5 sec check
                .ignoring(NoSuchElementException.class);  // Ignore NoSuchElement
       
        try {
            // Element clickable కావడానికి wait చేయండి (example button ID use చేయండి)
            WebElement button = fluentWait.until(
                    ExpectedConditions.elementToBeClickable(By.id("colorChange"))
            );
            button.click();
            System.out.println("Element clicked successfully!");
        } catch (Exception e) {
            System.out.println("Timeout or error: " + e.getMessage());
        } finally {
           // driver.quit();
        }

	}

}
