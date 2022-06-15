package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RegularVisitorLog {

    WebDriver driver;

    public RegularVisitorLog(WebDriver ldriver) {
	this.driver = ldriver;
    }

    @FindBy(xpath = "(//ul[@class='nav navbar-nav navbar-left ']//a)[18]")
    WebElement logs;

    @FindBy(xpath = "(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[2]")
    WebElement regularVisitor;

    @FindBy(xpath = "(//div[@class='v2-date-wrap'])/*/*/..")
    WebElement startDate;

    @FindBy(xpath = "//i[@class='v2-toggle-icon v2-toggle-icon__prev-month']")
    WebElement prevMonth;

    @FindBy(xpath = "(//span[text()='1'])[1]")
    WebElement date;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-block']")
    WebElement filter;

    @FindBy(xpath = "//input[@class='form-control']")
    WebElement search;

    @FindBy(xpath = "//a[text()='Reset Filter']")
    WebElement reset;

    @FindBy(xpath = "//div[@class='multiselect__select']")
    WebElement categoryDropdown;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement reportToggleButton;

    @FindBy(xpath = "//span[text()='Maid']")
    WebElement maid;

    @FindBy(xpath = "((//td[@class='vgt-left-align'])[1]//*)[1]")
    WebElement regularVisitorDetails;

    @FindBy(xpath = "//button[@class='close']")
    WebElement close;

    public void regular_visitors_log_test() throws InterruptedException {

	Thread.sleep(7000);
	Actions actions = new Actions(driver);
	WebElement menuOption = logs;
	Thread.sleep(3000);
	actions.moveToElement(menuOption).perform();
	Thread.sleep(3000);
	WebElement subMenuOption = regularVisitor;
	actions.moveToElement(subMenuOption).perform();
	subMenuOption.click();
	Thread.sleep(3000);
    }

    public void regular_visitors_sort_test() throws InterruptedException {

	startDate.click();
	Thread.sleep(3000);
	prevMonth.click();
	Thread.sleep(3000);
	date.click();
	Thread.sleep(3000);
	filter.click();
	Thread.sleep(3000);

    }

    public void searchByNameAndCategoryTest() throws InterruptedException {
	regular_visitors_log_test();
	regular_visitors_sort_test();
	search.sendKeys("ab");
	Thread.sleep(3000);
	filter.click();
	Thread.sleep(3000);
	reset.click();
	Thread.sleep(3000);
	regular_visitors_sort_test();
	Thread.sleep(3000);
	categoryDropdown.click();
	Thread.sleep(3000);
	maid.click();
	Thread.sleep(3000);
	reportToggleButton.click();
	Thread.sleep(3000);
	filter.click();
	Thread.sleep(3000);

    }

    public void regular_visitors_details_test() throws InterruptedException {

	regular_visitors_log_test();
	regularVisitorDetails.click();
	Thread.sleep(3000);
	close.click();
	Thread.sleep(3000);

    }

}