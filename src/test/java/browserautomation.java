import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class browserautomation {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = WebDriverManager.chromedriver().create();
    }
}
