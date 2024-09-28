import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class FrameSwitchingTest {
    public static void main(String[] args) {
        // Initialize the SafariDriver
        WebDriver driver = new SafariDriver();
        
        // Open the webpage with multiple iframes
        driver.get("https://ui.vision/demo/webtest/frames/");

        // Switch to the first iframe (left frame)
        driver.switchTo().frame("frame1");

        // Perform actions within the first iframe
        WebElement frame1Element = driver.findElement(By.tagName("h1"));
        System.out.println("Text inside the first iframe: " + frame1Element.getText());

        // Switch to the nested iframe within the first iframe
        driver.switchTo().frame(0);  // Switch to the inner iframe by index

        // Perform actions within the inner iframe
        WebElement innerFrameElement = driver.findElement(By.tagName("h1"));
        System.out.println("Text inside the inner iframe: " + innerFrameElement.getText());

        // Switch back to the first iframe
        driver.switchTo().parentFrame(); // This switches back to the parent frame (first iframe)

        // Switch back to the default content
        driver.switchTo().defaultContent();

        // Switch to the second iframe (middle frame)
        driver.switchTo().frame("frame2");

        // Perform actions within the second iframe
        WebElement frame2Element = driver.findElement(By.tagName("h1"));
        System.out.println("Text inside the second iframe: " + frame2Element.getText());

        // Switch back to the default content
        driver.switchTo().defaultContent();

        // Perform actions in the default content
        WebElement headerElement = driver.findElement(By.cssSelector("h2"));
        System.out.println("Text in the default content: " + headerElement.getText());
        
        // Close the browser
        driver.quit();
    }
}
