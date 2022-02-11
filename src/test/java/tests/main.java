package tests;

import Pages.CalculatorPage;
import Pages.DetailsPage;
import Pages.SearchPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main {

    private static  WebDriver driver;
    private static SearchPage searchPage;
    private static CalculatorPage calculatorPage;
    private static DetailsPage detailsPage;


    @BeforeEach
    public void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        calculatorPage = new CalculatorPage(driver);
        detailsPage = new DetailsPage(driver);
    }

    @BeforeEach
    public void setup(){
        driver.get("http://google.com");
    }

    @Test
    public void test1() {
        searchPage.search("Калькулятор" );
        calculatorPage.CalculatorInput90.click();
        calculatorPage.CalculatorInput1.click();
        calculatorPage.CalculatorInput91.click();
        calculatorPage.CalculatorInput2.click();
        calculatorPage.CalculatorInput92.click();
        calculatorPage.CalculatorInput93.click();
        calculatorPage.CalculatorInput3.click();
        calculatorPage.CalculatorInput94.click();
        calculatorPage.CalculatorInput4.click();
        calculatorPage.CalculatorInput0.click();
        calculatorPage.CalculatorInput95.click();
        calculatorPage.CalculatorInput5.click();
        calculatorPage.CalculatorInput96.click();
        assertAll(
                () -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", detailsPage.getExpression()),
                () -> assertEquals("1", detailsPage.getResults())
        );


    }

    @Test
    public void test2() {
        searchPage.search("Калькулятор");
        calculatorPage.CalculatorInput6.click();
        calculatorPage.CalculatorInput95.click();
        calculatorPage.CalculatorInput0.click();
        calculatorPage.CalculatorInput96.click();
        assertAll(
                () -> assertEquals("6 ÷ 0 =", detailsPage.getExpression()),
                () -> assertEquals("Infinity", detailsPage.getResults())
        );

    }

    @Test
    public void test3() {
        searchPage.search("Калькулятор");
        calculatorPage.CalculatorInput97.click();
        calculatorPage.CalculatorInput96.click();
        assertAll(
                () -> assertEquals("sin() =", detailsPage.getExpression()),
                () -> assertEquals("Error", detailsPage.getResults())
        );

    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
