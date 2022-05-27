package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleSetupPage {

    WebDriver driver;

    public VehicleSetupPage(WebDriver driver) 
    {
	this.driver = driver;
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]")
    WebElement property;
    @FindBy(xpath ="()")
}