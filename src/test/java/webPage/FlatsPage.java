package webPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class FlatsPage {
	
	WebDriver driver;
	public FlatsPage(WebDriver ldriver) {
		this.driver= ldriver;
	}

	@FindBy(xpath="(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]")
    WebElement property;
	
	@FindBy(xpath="//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a[text()='Flats']")
    WebElement flats;
	
	
	@FindBy(xpath="(//div[@class='form-group']//input)[1]")
    WebElement flatNo;

	@FindBy(xpath="(//div[@class='form-group']//input)[2]")
    WebElement areaInSqFt;
	
	@FindBy(xpath="//div[@class='multiselect__select']")
    WebElement flatOwnerDropdown;
	
	@FindBy(xpath="//span[text()='Soumya Kanti Jana     7003034823']")
    WebElement flatOwnerSelect;
	
	@FindBy(xpath="//button[@class='plus']")
    WebElement floorAddButton;
	
	@FindBy(xpath="//select[@class='form-control  select-style clr-ash']")
    WebElement selectBlock;
	
	@FindBy(xpath="(//label)[8]//input")
    WebElement commercialRadioButton;
	
	@FindBy(xpath="(//input)[7]")
    WebElement extensionNumber;
	
	@FindBy(xpath="//button[@class='btn btn-primary middle text-capitalize m-top  m-bot']")
    WebElement save;
	
	@FindBy(xpath="(//input)[9]")
    WebElement searchFlat;
	
	@FindBy(xpath="//button[@class='btn btn-success btn-table-header pull-right']")
    WebElement downloadReport;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
    WebElement editFlat;
	
	@FindBy(xpath="//button//strong[text()='Save']")
    WebElement saveFlat;
	
	@FindBy(xpath="(//strong)[4]")
    WebElement nextPagination;

	
			public  void flat_test() throws InterruptedException {
				    
					Thread.sleep(7000);
					Actions actions = new Actions(driver);
			        WebElement menuOption = property;
			        Thread.sleep(3000);
				  	actions.moveToElement(menuOption).perform();
			        Thread.sleep(3000);
				  	WebElement subMenuOption = flats; 
				  	actions.moveToElement(subMenuOption).perform();
					subMenuOption.click();
					Thread.sleep(3000);
				}
			
			public  void create_flat_test() throws InterruptedException {
				
				flatNo.sendKeys("hh");
				Thread.sleep(3000);
				areaInSqFt.sendKeys("1000");
				Thread.sleep(3000);
				flatOwnerDropdown.click();
				Thread.sleep(1000);
				flatOwnerSelect.click();
				Thread.sleep(1000);
				Select select1 = new Select(selectBlock);
				Thread.sleep(3000);
				select1.selectByVisibleText("Cascade");
			    Thread.sleep(3000);
				floorAddButton.click();
				Thread.sleep(1000);
				commercialRadioButton.click();
				Thread.sleep(1000);
				extensionNumber.sendKeys("+20");
				Thread.sleep(1000);
				save.click();
				Thread.sleep(3000);
				
			 }
			
			public  void search_flat_no_test() throws InterruptedException {
				
				searchFlat.sendKeys("1B");
				Thread.sleep(3000);
				searchFlat.sendKeys(Keys.CONTROL + "a");
				searchFlat.sendKeys(Keys.DELETE);
				Thread.sleep(3000);
				downloadReport.click();
				Thread.sleep(3000);
				
				
			}
			
			public  void edit_flat_and_pagination_test() throws InterruptedException {
				
				editFlat.click();
				Thread.sleep(2000);
				saveFlat.click();
				Thread.sleep(3000);
				nextPagination.click();
				Thread.sleep(3000);
				
			}
	}

