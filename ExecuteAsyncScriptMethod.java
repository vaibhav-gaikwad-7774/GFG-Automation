import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ExecuteAsyncScriptMethod {
    public static void main(String[] args) {
        // Step 1: Set up SafariDriver
        WebDriver driver = new SafariDriver();
        
        try {
            // Step 2: Navigate to the website
            driver.get("https://www.geeksforgeeks.org/");

            // Step 3: Get the current system time
            long startTime = System.currentTimeMillis();

            // Step 4: Create an instance of JavascriptExecutor
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

            // Step 5: Use executeAsyncScript to set a timeout
            jsExecutor.executeAsyncScript(
                "window.setTimeout(arguments[arguments.length - 1], 800);"
            );

            // Step 6: Calculate and print the time elapsed
            long elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println("Time Elapsed is: " + elapsedTime + " milliseconds");

            // Optional: Wait for a specific element to be present (example using WebDriverWait)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement exampleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Write for Us')]")));

            // Perform actions on the element if needed
            System.out.println("Element text: " + exampleElement.getText());

        } finally {
            // Step 7: Close the browser
            driver.quit();
        }
    }
}
