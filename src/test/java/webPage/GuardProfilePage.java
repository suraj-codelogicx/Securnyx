package webPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GuardProfilePage {

    WebDriver driver;

    public GuardProfilePage(WebDriver ldriver) {
	this.driver = ldriver;
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle border-quote-clr sm-arrow1 dropdown-toggle'])[1]")
    WebElement SupportStaff;

    @FindBy(xpath = "(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[1]")
    WebElement GuardProfile;

    @FindBy(xpath = "(//div[@class='form-group']//input)[1]")
    WebElement fName;

    @FindBy(xpath = "(//div[@class='form-group']//input)[2]")
    WebElement lName;

    @FindBy(xpath = "(//div[@class='form-group']//input)[3]")
    WebElement ph;

    @FindBy(xpath = "//button//strong[text()='Save']")
    WebElement save;

    @FindBy(xpath = "(//table[@class='table table-bordered m-zero']//button)[9]")
    WebElement edit;

    @FindBy(xpath = "(//div[@class='col-lg-6 col-sm-6']//input)[9]")
    WebElement fNameEdit;

    @FindBy(xpath = "(//div[@class='col-lg-6 col-sm-6']//input)[10]")
    WebElement lNameEdit;

    @FindBy(xpath = "(//div[@class='col-lg-12 col-sm-12']//input)[5]")
    WebElement phEdit;

    @FindBy(xpath = "(//td//a)[5]")
    WebElement saveEdit;

    public void guard_profile_test() throws InterruptedException {

	Thread.sleep(7000);
	Actions actions = new Actions(driver);
	WebElement menuOption = SupportStaff;
	Thread.sleep(3000);
	actions.moveToElement(menuOption).perform();
	Thread.sleep(3000);
	WebElement subMenuOption = GuardProfile;
	actions.moveToElement(subMenuOption).perform();
	subMenuOption.click();
	actions.moveToElement(fName).perform();
    }

    public void addGuard_test() throws InterruptedException {

	Thread.sleep(3000);
	fName.sendKeys("abbk");
	Thread.sleep(3000);
	lName.sendKeys("prama");
	Thread.sleep(3000);
	ph.sendKeys("9814543445");
	Thread.sleep(3000);
	save.click();
	Thread.sleep(3000);

    }

    public void addGuard_test_noLastName() throws InterruptedException {

	Thread.sleep(3000);
	fName.sendKeys("honey");
	Thread.sleep(3000);
	ph.sendKeys("9847810450");
	Thread.sleep(3000);
	save.click();
	Thread.sleep(3000);
    }

    public void addGuard_test_noFirstName() throws InterruptedException {

	Thread.sleep(3000);
	lName.sendKeys("dey");
	Thread.sleep(3000);
	ph.sendKeys("9884581345");
	Thread.sleep(3000);
	save.click();
	Thread.sleep(3000);
    }

    public void addGuard_test_noPhoneNumber() throws InterruptedException {

	Thread.sleep(3000);
	fName.sendKeys("sunny");
	Thread.sleep(3000);
	lName.sendKeys("deol");
	Thread.sleep(3000);
	save.click();
	Thread.sleep(3000);
    }

    public void addGuard_allBlank() throws InterruptedException {

	save.click();
	Thread.sleep(3000);
    }

    public void clearScreen() throws InterruptedException {

	fName.sendKeys(Keys.CONTROL + "a");
	fName.sendKeys(Keys.DELETE);
	Thread.sleep(3000);
	lName.sendKeys(Keys.CONTROL + "a");
	lName.sendKeys(Keys.DELETE);
	Thread.sleep(3000);
	ph.sendKeys(Keys.CONTROL + "a");
	ph.sendKeys(Keys.DELETE);
	Thread.sleep(3000);
    }

    public void editGuard() throws InterruptedException {
	Thread.sleep(3000);
	edit.click();
	Thread.sleep(1000);
	fNameEdit.clear();
	Thread.sleep(1000);
	fNameEdit.sendKeys("Abhishek2");
	Thread.sleep(1000);
	lNameEdit.clear();
	Thread.sleep(1000);
	lNameEdit.sendKeys("Pramanik2");
	Thread.sleep(2000);
	phEdit.clear();
	Thread.sleep(1000);
	phEdit.sendKeys("8777839478");
	Thread.sleep(1000);
	saveEdit.click();
	Thread.sleep(3000);

    }

}