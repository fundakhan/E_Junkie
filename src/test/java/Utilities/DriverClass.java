package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.impl.SimpleLogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverClass {

    private static WebDriver driver;


    public static WebDriver getDriver(){

        //if driver object is equal to null (there is no active driver instance) then we'll create a new driver
        if (driver == null){


            Logger.getLogger("").setLevel(Level.SEVERE); // To remove the red warning texts in the terminal
            System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error"); // To remove the first red two-line warning text in the terminal
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

        }
        return driver;
    }

    public static void quitDriver(){

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        if (driver != null){
            driver.quit();
            driver = null; // if we don't have this line next scenario will fail
                           // after driver.quit(); we need to set driver object to null
        }
    }

    public static void Wait(int second){

        try {
            Thread.sleep(second*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
