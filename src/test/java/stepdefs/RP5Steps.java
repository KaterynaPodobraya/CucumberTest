package src.test.java.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class RP5Steps {

    WebDriver driver;

    @Before
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void finish(){
        driver.close();
        driver.quit();
    }

    @Given ("^rp site is opened$")
    public void rp5_site_is_opened(){
        driver.get("http://rp5.ua/");
    }


    @When("^user selects (.*)$")
    public void userSelectsStepCity(String stepCity) throws Throwable {
        Thread.sleep(1000);
        WebElement search =  driver.findElement(By.id("searchStr"));
        Thread.sleep(1000);
        search.sendKeys(stepCity);
        Thread.sleep(1000);
        search.sendKeys(Keys.ENTER);
    }

    @Then ("^forecast is shown ([^\"]*)$")
    public boolean forecast_is_shown(String resultCity){
      return driver.findElement(By.cssSelector("#FheaderContent div h1")).getText().contains("in " +  resultCity);
    }

}
