package stepDefinition;

import Pages.applicationPage;
import Pages.errorsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class stepDef {
    static  WebDriver driver=null;
    //applicationPage form;

    @Given("I Launch The Browser")
    public void LaunchTheBrowser() {
        String systemPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", systemPath+"/src/test/resources/drivers/chromedriver");
     //   System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver=new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
//        wait.until(driver.manage().window().maximize());
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @When("I Open The Pre-retirement calculator")
    public void OpenTheCalculator() {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.securian.com/insights-tools/retirement-calculator.html");
    }
    @Then("Common details of the form")
    public void fillTheDetails() throws InterruptedException, AWTException {
        applicationPage form = new applicationPage(driver);
        form = new applicationPage(driver);
        form.fillTheFormWithCommonDetails();
    }
    @Then("Fill the additional Fields")
    public void additionalDetails() throws InterruptedException, AWTException {
        applicationPage form = new applicationPage(driver);
        form = new applicationPage(driver);
        form.additionalDetails();
    }
    @Then("Submit the application")
    public void calculate() {
        applicationPage form = new applicationPage(driver);
        form.calculator();
    }
    @Then("Validate results")
    public void validateResults() {
    applicationPage form = new applicationPage(driver);
    form.validateResults();
    }
    @Then("Edit Info")
    public void editInfo() {
        applicationPage form = new applicationPage(driver);
        form.editInformation();

    }
    @Then("Clear form")
    public void clearTheForm() {
        applicationPage form = new applicationPage(driver);
        form.clearInfomation();
    }
    @Then("Submit the form without filling the mandatory fields")
    public void calculateEmpty() {
        errorsPage emptyForm = new errorsPage(driver);
        emptyForm.submitEmpty();
    }
    @Then("Error messages should be displayed")
    public void validateErrors() {
        errorsPage emptyForm = new errorsPage(driver);
        emptyForm.validateErrors();
    }

    @Then("Close the browser")
    public void close() {
        applicationPage form = new applicationPage(driver);
        form.closeBrowser();
    }



}


