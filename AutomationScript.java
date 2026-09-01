import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("test@example.com");
        driver.findElement(By.id("input-password")).sendKeys("password123");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.quit();
    }
}
