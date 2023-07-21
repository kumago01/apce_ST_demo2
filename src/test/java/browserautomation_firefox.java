import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class browserautomation_firefox {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = WebDriverManager.firefoxdriver().create();
        Thread.sleep(1000);
    }
}
