import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SafariClickHiddenElement {
    public static void main(String[] args) {
        // Step 1: Set up SafariDriver
        WebDriver driver = new SafariDriver();
        
        // Step 2: Navigate to GeeksforGeeks website
        driver.get("https://www.geeksforgeeks.org");
        
        // Step 3: Wait until the element is present using XPath
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement hiddenElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='topMainHeader']/div/ul/li[4]/ul/li[1]/a")));
        
        // Step 4: Use JavascriptExecutor to click on the hidden element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hiddenElement);
        
        // Step 5: Close the browser
        driver.quit();
    }
}
