package StepDefinitions;

import Utilities.DriverClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.time.LocalDateTime;

public class Hooks {

    WebDriver driver = DriverClass.getDriver();
    LocalDateTime startDateTime;
    @Before // this part before navigate is before each class
    public void beforeScenario(){

        driver.get("https://shopdemo.e-junkie.com/");
        DriverClass.getDriver().manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        startDateTime = LocalDateTime.now();
        System.out.println("Scenario Started!");
    }

    @After
    public void afterScenario(Scenario scenario){

        System.out.println("Scenario has ended");
        LocalDateTime endTime = LocalDateTime.now();

        DriverClass.quitDriver();



        }
}
