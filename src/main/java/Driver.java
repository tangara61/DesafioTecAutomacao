import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    WebDriver driver;
    @Before
    public WebDriver Webdriver(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://sampleapp.tricentis.com/101/app.php");
        driver.manage().window().maximize();
        return driver;
    }

}
