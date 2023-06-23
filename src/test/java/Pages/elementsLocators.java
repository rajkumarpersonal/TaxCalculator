package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class elementsLocators {
    WebDriver driver;
    By currentAge = By.id("current-age");
    By retirementAge = By.id("retirement-age");
    By currentIncome = By.id("current-income");
    By spouseIncome = By.id("spouse-income");
    By savingsBalance = By.id("current-total-savings");
    By currentAnnualSaving = By.id("current-annual-savings");
    By rateOfIncrease = By.id("savings-increase-rate");
    By securityBenefitsNo = By.xpath("//*[@id=\"include-social-container\"]/ul/li[2]");
    By securityBenefitsYes = By.xpath("//*[@id='include-social-container']/ul/li[1]/label");
    By securityOverrideAmount = By.id("social-security-override");
    By single = By.id("single");
    By married = By.xpath("//*[@id='marital-status-ul']/li[2]");
    By calculateButton = By.xpath("//*[@id='retirement-form']/div[4]/div[2]/div[1]/button");
    By clearButton = By.xpath("//*[@id='retirement-form']/div[4]/div[2]/div[2]/button");

    //Error Message
    By errorMessage = By.xpath("//*[@id=\"calculator-input-alert\"]\n");
    //String exceptedMessage = "Please fill out all required fields";
    By invalidErrors = By.xpath("//*[@class='invalid-error']");

//    //Results
//    By result = By.id("result-message");
//    By retireMoney = By.xpath("//*[@id='retirement-amount-results']");
//    By savedMoney = By.id("current-savings-results");

    //EditInfo
    By editButton = By.xpath("//*[@id='calculator-results-container']/div[2]/div[2]/div[2]/div/div[2]/div/button");

    //Resultsvalidation

    By resultMessage = By.id("result-message");
    By minNeededAmount = By.id("retirement-amount-results");
    By savedAmount = By.id("current-savings-results");
    By emailResults = By.xpath("//*[@id=\"calculator-results-container\"]/div[2]/div[2]/div[2]/div/div[1]/div/button");
    By editInfo = By.xpath("//*[@id=\"calculator-results-container\"]/div[2]/div[2]/div[2]/div/div[2]/div/button");
    By fullResults = By.xpath("//*[@id=\"calculator-results-container\"]/div[2]/div[2]/div[2]/div/div[3]/div/button");

}
