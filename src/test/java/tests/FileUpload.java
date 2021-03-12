package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args){

        System.setProperty("webdriver.chromedriver.driver", "C:\\chromedriver.exe");

        WebDriver driver  = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
        fileUpload.sendKeys("C:\\Users\\Fujitsu\\Desktop\\TestReconct5.txt");

        driver.quit();
    }
}
