package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationDemo {


    @Test
    public void gotoTrelloLoginPage() {
        // Set up the chromedriver --- chrome
        // [*] ----->[chromedriver]----{google chrome}
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();

        // Selenium Java
        chromeDriver.get("https://trello.com");
        chromeDriver.manage().window().maximize();
        WebElement loginLink = chromeDriver.findElement(By.linkText("Log In"));
        loginLink.click();

    }
}
