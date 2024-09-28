import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class SafariClickAlternativeExample {
    public static void main(String[] args) {
        // Step 1: Set up SafariDriver
        WebDriver driver = new SafariDriver();
        
        // Step 2: Navigate to a website
        driver.get("https://www.example.com"); // Replace with the URL you want to test

        // Step 3: Locate the web element using By selector
        WebElement exampleButton = driver.findElement(By.id("exampleButton")); // Replace with the actual element ID

        // Step 4: Use JavaScript Executor to click the button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", exampleButton);

        // Step 5: Close the browser
        driver.quit();
    }
}
