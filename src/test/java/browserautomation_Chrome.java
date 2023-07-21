import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class browserautomation_Chrome {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = WebDriverManager.chromedriver().create();
    }
}
