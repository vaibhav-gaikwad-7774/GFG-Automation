import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ExecuteScriptOnGeeksforGeeks {
    public static void main(String[] args) {
        // Step 1: Set up SafariDriver
        WebDriver driver = new SafariDriver();
        
        try {
            // Step 2: Navigate to the GeeksforGeeks website
            driver.get("https://www.geeksforgeeks.org/");

            // Step 3: Create an instance of JavascriptExecutor
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

            // Step 4: Execute JavaScript code to retrieve the document's ready state
            String readyState = (String) jsExecutor.executeScript("return document.readyState");

            // Step 5: Output the ready state
            System.out.println("Document ready state: " + readyState);

            // Optional: Wait for a specific element to be present (example using WebDriverWait)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement exampleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Write for Us')]")));

            // Perform actions on the element if needed
            System.out.println("Element text: " + exampleElement.getText());

        } finally {
            // Step 6: Close the browser
            driver.quit();
        }
    }
}
