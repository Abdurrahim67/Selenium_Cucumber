package pages;

import io.cucumber.java.an.E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {

    public DemoPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy (xpath = "//span[.='Alerts']")
    public WebElement alertWE;

    @FindBy (xpath = "//*[@id='timerAlertButton']")
    public WebElement click;

}
