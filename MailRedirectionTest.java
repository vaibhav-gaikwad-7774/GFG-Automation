import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MailRedirectionTest {
    public static void main(String[] args) {
        // Set up WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to mail.com
            driver.get("https://www.mail.com/");

            // Optionally, maximize the browser window
            driver.manage().window().maximize();

            // Wait for the page to load completely
            Thread.sleep(2000);

            // Example 1: Click on the 'Login' button/link
            WebElement loginButton = driver.findElement(By.linkText("Login"));
            loginButton.click();

            // Wait for the redirection to complete
            Thread.sleep(3000);

            // Example 2: Alternatively, click on the 'Sign Up' button/link
            // WebElement signUpButton = driver.findElement(By.linkText("Sign Up"));
            // signUpButton.click();

            // Optional: Print the current URL to verify the redirection
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Current URL after redirection: " + currentUrl);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
