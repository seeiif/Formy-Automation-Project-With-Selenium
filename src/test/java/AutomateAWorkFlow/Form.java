package AutomateAWorkFlow;

import Pages.ConfirmationPage;
import Pages.FormPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
   public static void main(String[] args){
       System.setProperty("webdriver.chromedriver.driver", "C:\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();

       driver.get("https://formy-project.herokuapp.com/form");

       FormPage formPage = new FormPage();
       formPage.submitForm(driver);

       ConfirmationPage confirmationPage = new ConfirmationPage();

       confirmationPage.waitForAlertBanner(driver);

       Assertions.assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

       driver.quit();
   }
}
