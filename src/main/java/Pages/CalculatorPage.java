package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalculatorPage {

// Действия
    //(
    @FindBy(css = "div[jsname*='j93WEe']")
    public WebElement CalculatorInput90;

    //+
    @FindBy(css = "div[jsname*='XSr6wc']")
    public WebElement CalculatorInput91;

    //)
    @FindBy(css = "div[jsname*='qCp9A']")
    public WebElement CalculatorInput92;

    //*
    @FindBy(css = "div[jsname*='YovRWb']")
    public WebElement CalculatorInput93;

    //-
    @FindBy(css = "div[jsname*='pPHzQc']")
    public WebElement CalculatorInput94;

    // '/'
    @FindBy(css = "div[jsname*='WxTTNd']")
    public WebElement CalculatorInput95;

    //=
    @FindBy(css = "div[jsname*='Pt8tGc']")
    public WebElement CalculatorInput96;

    //Sin
    @FindBy(css = "div[jsname*='aN1RFf']")
    public WebElement CalculatorInput97;


    // Цифры

    @FindBy(css = "div[jsname*='bkEvMb']")
    public WebElement CalculatorInput0;

    @FindBy(css = "div[jsname*='N10B9']")
    public WebElement CalculatorInput1;

    @FindBy(css = "div[jsname*='lVjWed']")
    public WebElement CalculatorInput2;

    @FindBy(css = "div[jsname*='KN1kY']")
    public WebElement CalculatorInput3;

    @FindBy(css = "div[jsname*='xAP7E']")
    public WebElement CalculatorInput4;

    @FindBy(css = "div[jsname*='Ax5wH']")
    public WebElement CalculatorInput5;

    @FindBy(css = "div[jsname*='abcgof']")
    public WebElement CalculatorInput6;



    public CalculatorPage(WebDriver driver) {
        initElements(driver, this);
    }

}
