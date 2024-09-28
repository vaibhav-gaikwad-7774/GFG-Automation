import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class SendKeysExample {
    public static void main(String[] args) {
        // Initialize SafariDriver
        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com");

        // Wait for element to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
        element.sendKeys("text to input");

        // Handle complex interactions
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().sendKeys("text to input").perform();

        // Handle JavaScript-based inputs
        ((JavascriptExecutor) driver).executeScript("arguments[0].value='text to input';", element);

        driver.quit();
    }
}
