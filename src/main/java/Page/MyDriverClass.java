package Page;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MyDriverClass {

    private static WebDriver driver;
    private static final Properties driverValue = new Properties();

//@BeforeClass
    public static void StartDriver() throws IOException {
        driverValue.load(new FileInputStream(new File("src/main/resources/driver.properties")));
        switch (driverValue.getProperty("browser")) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", driverValue.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", driverValue.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
        }
        driver.get(driverValue.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }

    //@AfterClass
    public static void ZavershenieDriver() {
        for (String s : driver.getWindowHandles())
            driver.switchTo().window(s).close();
            driver.quit();
    }
    public static WebDriver getDriver() {
        return driver;
    }
}

