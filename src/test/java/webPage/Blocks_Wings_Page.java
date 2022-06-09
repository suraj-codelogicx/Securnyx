package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Blocks_Wings_Page {

    WebDriver driver;

    public Blocks_Wings_Page(WebDriver ldriver) {
	this.driver = ldriver;
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]")
    WebElement property;

    @FindBy(xpath = "(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[2]")
    WebElement blockWings;

    @FindBy(xpath = "//input[@class='vgt-input vgt-pull-left']")
    WebElement searchTable;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
    WebElement editName;

    @FindBy(xpath = "(//div[@class='modal-wrapper']//button)[2]")
    WebElement save;

    @FindBy(xpath = "//div[@class='form-group']//input")
    WebElement addTable;

    @FindBy(xpath = "//button[@class='btn btn-primary middle text-capitalize m-top  m-bot']")
    WebElement saveTable;

    @FindBy(xpath = "//button[@class='btn btn-success btn-table-header pull-right']")
    WebElement reportDownload;

    public void BlocksTest() throws InterruptedException {

	Thread.sleep(7000);
	Actions actions = new Actions(driver);
	WebElement menuOption = property;
	Thread.sleep(3000);
	actions.moveToElement(menuOption).perform();
	Thread.sleep(3000);
	WebElement subMenuOption = blockWings;
	actions.moveToElement(subMenuOption).perform();
	subMenuOption.click();
	Thread.sleep(3000);
	searchTable.sendKeys("Aspen");
	Thread.sleep(3000);
	editName.click();
	Thread.sleep(3000);
	save.click();
	Thread.sleep(3000);
	addTable.sendKeys("Aspen-2");
	Thread.sleep(3000);
	saveTable.click();
	Thread.sleep(3000);
	reportDownload.click();
	Thread.sleep(3000);

    }
}
