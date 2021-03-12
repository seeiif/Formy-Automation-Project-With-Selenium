package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args){

        System.setProperty("webdriver.chromedriver.driver", "C:\\chromedriver.exe");

        WebDriver driver  = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement DropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        DropDownMenu.click();

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();

        driver.quit();
    }
}
