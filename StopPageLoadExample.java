import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class StopPageLoadExample {
    public static void main(String[] args) {
        // Set up SafariDriver (no need to specify path as SafariDriver is built-in)
        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        
        try {
            driver.get("https://example.com");

            // Stop page load using JavaScript
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.stop();");

            // Use explicit wait to handle elements
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
            
            System.out.println("Element found: " + element.getText());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
