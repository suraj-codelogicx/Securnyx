package webPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class VehicleSetupPage {

    WebDriver driver;

    public VehicleSetupPage(WebDriver driver) {
	this.driver = driver;
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]")
    WebElement Property;

    @FindBy(xpath = "(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[5]")
    WebElement VehicleSetup;

    @FindBy(xpath = "//select[@class='form-control  select-style clr-ash']")
    WebElement vehicleType;

    @FindBy(xpath = "(//div[@class='form-group'])[2]//input")
    WebElement vehicleNumber;

    @FindBy(xpath = "//div[@class='multiselect__tags']")
    WebElement vehicleOwner;

    @FindBy(xpath = "(//li[@class='multiselect__element'])[1]")
    WebElement vehicleOwnerList;

    @FindBy(xpath = "//button//strong[text()='Save']")
    WebElement save;

    @FindBy(xpath = "//button//strong[text()='Reset']")
    WebElement Reset;

    @FindBy(xpath = "//div[@class='col-md-9']//input")
    WebElement search;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
    WebElement edit;

    @FindBy(xpath = "(//button//strong[text()='Save'])[1]")
    WebElement saveEdited;

    @FindBy(xpath = "//span[text()='Vehicle List Report']")
    WebElement report;

    public void VehicleSetupPageTest() throws InterruptedException {

	Thread.sleep(10000);
	Actions actions = new Actions(driver);
	WebElement menuOption = Property;
	Thread.sleep(3000);
	actions.moveToElement(menuOption).perform();
	Thread.sleep(3000);
	WebElement subMenuOption = VehicleSetup;
	actions.moveToElement(subMenuOption).perform();
	subMenuOption.click();
	Thread.sleep(3000);

    }

    public void VehicleTypeAddTest() throws InterruptedException {
	Select select1 = new Select(vehicleType);
	Thread.sleep(3000);
	select1.selectByVisibleText("Two Wheeler");
	Thread.sleep(3000);
	vehicleNumber.sendKeys("wrh1150hh");
	Thread.sleep(3000);
	vehicleOwner.click();
	Thread.sleep(3000);
	vehicleOwnerList.click();
	Thread.sleep(3000);
	save.click();
	Thread.sleep(3000);

    }

    public void VehicleTypeAddTestWithoutOwner() throws InterruptedException {
	Select select3 = new Select(vehicleType);
	Thread.sleep(3000);
	select3.selectByVisibleText("Two Wheeler");
	Thread.sleep(3000);
	vehicleNumber.clear();
	Thread.sleep(3000);
	vehicleNumber.sendKeys("bhnjwe151");
	Thread.sleep(3000);
	save.click();
	isAlertPresent();
	Thread.sleep(5000);

    }

    public boolean isAlertPresent() {
	try {
	    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	    Alert a = driver.switchTo().alert();
	    a.accept();
	    return true;
	} catch (NoAlertPresentException e) {
	    return false;
	} finally {
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
    }

    public void VehicleTypeResetButton() throws InterruptedException {
	Select select2 = new Select(vehicleType);
	Thread.sleep(3000);
	select2.selectByVisibleText("Four Wheeler");
	Thread.sleep(3000);
	vehicleNumber.clear();
	Thread.sleep(3000);
	vehicleNumber.sendKeys("mhfsdds12hh");
	Thread.sleep(3000);
	vehicleOwner.click();
	Thread.sleep(3000);
	vehicleOwnerList.click();
	Thread.sleep(3000);
	Reset.click();
	Thread.sleep(5000);

    }

    public void VehicleTypeFunctionality() throws InterruptedException {

	edit.click();
	Thread.sleep(3000);
	saveEdited.click();
	Thread.sleep(3000);
	report.click();
	Thread.sleep(3000);
	search.sendKeys("wb15");
	Thread.sleep(3000);
	search.clear();
	Thread.sleep(3000);

    }
}
