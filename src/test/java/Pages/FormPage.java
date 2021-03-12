package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public static void submitForm(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("Seif");

        driver.findElement(By.id("last-name")).sendKeys("Kchiche");

        driver.findElement(By.id("job-title")).sendKeys("Test automation engineer");

        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("2/11/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
