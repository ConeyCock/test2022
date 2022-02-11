package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class DetailsPage {

    @FindBy(css = "span[jsname*='ubtiRe']")
    public WebElement expression;

    @FindBy(css = "span[jsname*='VssY5c']")
    public WebElement results;


    public DetailsPage(WebDriver driver) {
        initElements(driver, this);
    }

    public String getExpression(){
        return expression.getText();
    }

    public String getResults(){
        return results.getText();
    }
}
