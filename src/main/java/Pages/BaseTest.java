package Pages;
import org.junit.AfterClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static  WebDriver driver = null;


    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Driver/chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println("Trump");
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void prepareDriver(){
        if (driver != null) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
    }

}
