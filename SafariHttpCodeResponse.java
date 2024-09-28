import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SafariHttpCodeResponse {
    public static void main(String[] args) throws MalformedURLException, IOException {
        // Step 1: Set up SafariDriver
        WebDriver driver = new SafariDriver();

        // Step 2: Navigate to GeeksforGeeks website
        driver.get("https://www.geeksforgeeks.org");

        // Step 3: Implicit wait of 8 seconds
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        // Step 4: Establish connection with the URL
        HttpURLConnection connection = (HttpURLConnection) new URL("https://www.geeksforgeeks.org").openConnection();

        // Step 5: Set the request method to HEAD to check the HTTP status code
        connection.setRequestMethod("HEAD");

        // Step 6: Initiate the connection
        connection.connect();

        // Step 7: Get the HTTP response code
        int responseCode = connection.getResponseCode();
        System.out.println("HTTP Response Code: " + responseCode);

        // Step 8: Close the browser
        driver.quit();
    }
}
