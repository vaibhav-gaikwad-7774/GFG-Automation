import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

public class JsClickGeeksforGeeks {
   public static void main(String[] args) {
      // Set up SafariDriver
      WebDriver driver = new SafariDriver();
      
      // Implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      // Launch URL
      driver.get("https://www.geeksforgeeks.org/");
      
      // Identify the element using a CSS selector
      WebElement articlesLink = driver.findElement(By.cssSelector("a[href='/articles/']"));
      
      // Click with JavaScript Executor
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].click();", articlesLink);
      
      // Close the browser
      driver.quit();
   }
}
