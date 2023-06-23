package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class errorsPage extends elementsLocators{
    WebDriver driver;
    //= new ChromeDriver();
    public errorsPage(WebDriver driver) {
        this.driver=driver;
    }
    public void submitEmpty() {

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,500)", "");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
            wait.until(ExpectedConditions.elementToBeClickable(calculateButton)).click();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            throw new NullPointerException();
        }
    }


    public void validateErrors() {
        WebElement errorMessageElement = driver.findElement(errorMessage);
       // WebElement errorMessageElement = (WebElement) errorMessage;
        String actualErrorMessage = errorMessageElement.getText();
        String expectedErrorMessage = "Please fill out all required fields";
        assertEquals(expectedErrorMessage, actualErrorMessage);
        System.out.println("Actual Error Message: " + actualErrorMessage);

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(250));
        List<WebElement> invalid = driver.findElements(invalidErrors);
       // List<WebElement> errorElements = (List<WebElement>) invalidErrors;
        String expectedError = "Input required";

        for (WebElement errorElement : invalid) {
            String actualError = errorElement.getText();
            System.out.println("Actual Error Message: " + actualError);
            assertEquals(expectedError, actualError);
        }

    }
}