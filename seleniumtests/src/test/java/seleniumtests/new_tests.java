import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class new_tests {

    private WebDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://hub:4444/wd/hub"), dc);
    }

    @Test
    public void googleTest() throws InterruptedException {
        driver.get("https://login.microsoftonline.com");
        System.out.println(driver.getTitle());
        
    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        driver.quit();
    }

}
