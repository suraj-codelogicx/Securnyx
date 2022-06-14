package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ParkingSpacePage {

    WebDriver driver;

    public ParkingSpacePage(WebDriver ldriver) {
	this.driver = ldriver;
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]")
    WebElement Property;

    @FindBy(xpath = "//a[text()='Parking Space']")
    WebElement parkingSpace;

    @FindBy(xpath = "(//div[@class='multiselect__select'])[1]")
    WebElement selectUnits;

    @FindBy(xpath = "//span[text()='Aspen - 2A']")
    WebElement flatName;

    @FindBy(xpath = "//button//strong[text()='Add Parking Space']")
    WebElement addParkingSpace;

    @FindBy(xpath = "//input[@class='form-control']")
    WebElement parkingName;

    @FindBy(xpath = "//button//strong[text()='Save']")
    WebElement save;

    @FindBy(xpath = "(//div[@class='multiselect__select'])[2]")
    WebElement searchParking;

    @FindBy(xpath = "(//span[text()='Flat No.'])[1]")
    WebElement flatNo;

    @FindBy(xpath = "(//div[@class='multiselect__select'])[3]")
    WebElement selectUnit;

    @FindBy(xpath = "(//span[text()='Horizon - 1B'])[2]")
    WebElement unitName;

    @FindBy(xpath = "(//span//i)[3]")
    WebElement update;

    @FindBy(xpath = "//button[@class='button-new button-accept']")
    WebElement updateButton;

    public void parkingspace_test() throws InterruptedException {

	Thread.sleep(7000);
	Actions actions = new Actions(driver);
	WebElement menuOption = Property;
	Thread.sleep(3000);
	actions.moveToElement(menuOption).perform();
	Thread.sleep(3000);
	WebElement subMenuOption = parkingSpace;
	actions.moveToElement(subMenuOption).perform();
	subMenuOption.click();
	Thread.sleep(3000);
	selectUnits.click();
	Thread.sleep(3000);
	flatName.click();
	Thread.sleep(1000);
	addParkingSpace.click();
	Thread.sleep(3000);
	parkingName.sendKeys("new Parking5");
	Thread.sleep(1000);
	save.click();
	Thread.sleep(3000);
	searchParking.click();
	Thread.sleep(3000);
	flatNo.click();
	Thread.sleep(3000);
	selectUnit.click();
	Thread.sleep(3000);
	unitName.click();
	Thread.sleep(3000);
	update.click();
	Thread.sleep(3000);
	updateButton.click();
	Thread.sleep(3000);

    }

}