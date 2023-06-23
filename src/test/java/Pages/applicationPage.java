package Pages;


import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class applicationPage extends elementsLocators {
    WebDriver driver;

    public applicationPage(WebDriver driver) {
        this.driver=driver;
    }
    public void fillTheFormWithCommonDetails() throws InterruptedException, AWTException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
        wait.until(ExpectedConditions.elementToBeClickable(currentAge)).sendKeys("40");
        wait.until(ExpectedConditions.elementToBeClickable(retirementAge)).sendKeys("68");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,500)", "");

        wait.until(ExpectedConditions.elementToBeClickable(currentIncome)).click();
        Robot robot = new Robot();
        robot.setAutoDelay(250);
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        wait.until(ExpectedConditions.elementToBeClickable(currentIncome)).sendKeys("100000");

        wait.until(ExpectedConditions.elementToBeClickable(spouseIncome)).click();
        Robot robot1 = new Robot();
        robot1.setAutoDelay(250);
        robot1.keyPress(KeyEvent.VK_RIGHT);
        robot1.keyRelease(KeyEvent.VK_RIGHT);
        wait.until(ExpectedConditions.elementToBeClickable(spouseIncome)).sendKeys("75000");

        wait.until(ExpectedConditions.elementToBeClickable(savingsBalance)).click();
        Robot robot3 = new Robot();
        robot3.setAutoDelay(250);
        robot3.keyPress(KeyEvent.VK_RIGHT);
        robot3.keyRelease(KeyEvent.VK_RIGHT);
        wait.until(ExpectedConditions.elementToBeClickable(savingsBalance)).sendKeys("500000");

        wait.until(ExpectedConditions.elementToBeClickable(currentAnnualSaving)).click();
        Robot robot4 = new Robot();
        robot4.setAutoDelay(250);
        robot4.keyPress(KeyEvent.VK_RIGHT);
        robot4.keyRelease(KeyEvent.VK_RIGHT);
        wait.until(ExpectedConditions.elementToBeClickable(currentAnnualSaving)).sendKeys("10");

        wait.until(ExpectedConditions.elementToBeClickable(rateOfIncrease)).click();
        Robot robot5 = new Robot();
        robot5.setAutoDelay(250);
        robot5.keyPress(KeyEvent.VK_RIGHT);
        robot5.keyRelease(KeyEvent.VK_RIGHT);
        wait.until(ExpectedConditions.elementToBeClickable(rateOfIncrease)).sendKeys("2");

//        WebElement elementNo = (WebElement) securityBenefitsNo;
//        WebElement elementYes = (WebElement) securityBenefitsYes;
//
//        if(elementNo.isSelected()){
//            System.out.println("Social Security Income selected NO");
//            calculator();
//            validateResults();
//            editInformation();
//            clearInfomation();
//
//        }
//        else {
//            System.out.println("Social Security Income selected Yes");
//            additionalDetails();
//            calculator();
//            validateResults();
//            editInformation();
//            clearInfomation();
//
//        }
    }
    public void calculator(){

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(calculateButton)).click();
    }

    public void editInformation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        wait.until(ExpectedConditions.elementToBeClickable(editButton)).click();
    }

    public void validateResults(){


        String result=new WebDriverWait(driver,Duration.ofSeconds(20))
                                .until(ExpectedConditions.elementToBeClickable(resultMessage)).getText();

        System.out.println("Result Message is : " + result);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement money = driver.findElement(minNeededAmount) ;
        String retirementMoney = money.getText();
        System.out.println("Minimum needed to retire is : " + retirementMoney);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement saveMoney = driver.findElement(savedAmount) ;
        String moneySaved = saveMoney.getText();
        System.out.println("What you have saved is : " + moneySaved);


    }
    public void clearInfomation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,500)", "");
        wait.until(ExpectedConditions.elementToBeClickable(clearButton)).click();

    }
    public  void additionalDetails() throws InterruptedException, AWTException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
        JavascriptExecutor executor1=(JavascriptExecutor)driver;
        executor1.executeScript("window.scrollBy(0,500)","");

       try {
            wait.until(ExpectedConditions.elementToBeClickable(securityBenefitsYes)).click();


        } catch (Exception e) {
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
//            options.addArguments("start-maximized");
//            WebDriver driver = new ChromeDriver(options);

            WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(100));
            wait1.until(ExpectedConditions.elementToBeSelected(married));
        }

        wait.until(ExpectedConditions.elementToBeClickable(securityOverrideAmount)).click();
        Robot robot6=new Robot();
        robot6.setAutoDelay(250);
        robot6.keyPress(KeyEvent.VK_RIGHT);
        robot6.keyRelease(KeyEvent.VK_RIGHT);
        wait.until(ExpectedConditions.elementToBeClickable(securityOverrideAmount)).sendKeys("4000");

    }
    public void closeBrowser(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        System.out.println("Successfully Executed");
        driver.close();
    }


}

