package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class main {

    private static  WebDriver driver;


    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void test1() {
        driver.get("http://google.com");
        driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
        driver.findElement(By.cssSelector("div[jsname*='j93WEe']")).click();
        driver.findElement(By.cssSelector("div[jsname*='N10B9']")).click();
        driver.findElement(By.cssSelector("div[jsname*='XSr6wc']")).click();
        driver.findElement(By.cssSelector("div[jsname*='lVjWed']")).click();
        driver.findElement(By.cssSelector("div[jsname*='qCp9A']")).click();
        driver.findElement(By.cssSelector("div[jsname*='YovRWb']")).click();
        driver.findElement(By.cssSelector("div[jsname*='KN1kY']")).click();
        driver.findElement(By.cssSelector("div[jsname*='pPHzQc']")).click();
        driver.findElement(By.cssSelector("div[jsname*='xAP7E']")).click();
        driver.findElement(By.cssSelector("div[jsname*='bkEvMb']")).click();
        driver.findElement(By.cssSelector("div[jsname*='WxTTNd']")).click();
        driver.findElement(By.cssSelector("div[jsname*='Ax5wH']")).click();
        driver.findElement(By.cssSelector("div[jsname*='Pt8tGc']")).click();

    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
