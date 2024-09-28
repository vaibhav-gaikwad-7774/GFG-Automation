import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLoginTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Gmail login page
            driver.get("https://mail.google.com/");

            // Enter email
            WebElement emailField = driver.findElement(By.id("identifierId"));
            emailField.sendKeys("your-email@gmail.com");

            // Click on the Next button
            WebElement nextButton = driver.findElement(By.id("identifierNext"));
            nextButton.click();

            // Wait for password field to be visible and enter password
            Thread.sleep(2000); // Replace with WebDriverWait for better practice
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("your-password");

            // Click on the Next button
            WebElement nextButtonPassword = driver.findElement(By.id("passwordNext"));
            nextButtonPassword.click();

            // Optional: Wait for some time to observe the result
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
