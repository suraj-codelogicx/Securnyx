package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {

    WebDriver driver;

    public AddUserPage(WebDriver driver) {
	this.driver = driver;
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    @CacheLookup
    WebElement Username;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    @CacheLookup
    WebElement Password;

    @FindBy(xpath = "(//*[@name='button'])[2]")
    @CacheLookup
    WebElement Loginbutton;

    @FindBy(xpath = "//a[normalize-space()='Support Staffs']")
    @CacheLookup
    WebElement PropertyDropdown;

    @FindBy(xpath = "(//a[text()='Flat Owners'])[1]")
    @CacheLookup
    WebElement Flatowner;

    @FindBy(xpath = "//div[1]//div[1]//button[1]//span[1]")
    @CacheLookup
    WebElement addUser;

    @FindBy(xpath = "//input[contains(@placeholder,'First Name')]")
    @CacheLookup
    WebElement fname;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    @CacheLookup
    WebElement lname;

    @FindBy(xpath = "//input[@placeholder='Email']")
    @CacheLookup
    WebElement emailbox;

    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    @CacheLookup
    WebElement Phoneno;

    @FindBy(xpath = "//div[@class='form-group']//div[@class='multiselect__select']")
    @CacheLookup
    WebElement Dropdown;

    @FindBy(xpath = "//div[contains(@class,'multiselect multiselect--active')]//span[contains(@class,'multiselect__option multiselect__option--highlight')]")
    @CacheLookup
    WebElement Cascade;

    @FindBy(xpath = "//label[contains(@class,'material-checkbox')]//span[contains(text(),'Committee Member')]")
    @CacheLookup
    WebElement Committee;

    @FindBy(xpath = "//input[contains(@placeholder,'Designation')]")
    @CacheLookup
    WebElement CommitteeTextbox;

    @FindBy(xpath = "//strong[normalize-space()='Save']")
    @CacheLookup
    WebElement saveButton;

    public void setEmail(String strEmail) {

	Username.sendKeys(strEmail);
    }

    public void setPassword(String strPassword) {

	Password.sendKeys(strPassword);
    }

    public void clickOnLoginButton() {

	Loginbutton.click();

    }

    public void clickOnDropdown() {

	PropertyDropdown.click();

    }

    public void clickOnFlatowner() {

	Flatowner.click();

    }

    public void clickOnaddUser() {

	addUser.click();

    }

    public void setfname(String strfname) {

	fname.sendKeys(strfname);
    }

    public void setlname(String strlname) {

	lname.sendKeys(strlname);
    }

    public void setEmail2(String strEmail2) {

	emailbox.sendKeys(strEmail2);
    }

    public void setphoneno(String strphoneno) {

	Phoneno.sendKeys(strphoneno);
    }

    public void clickOndropdown2() {

	Dropdown.click();

    }

    public void clickOnCascade() {

	Cascade.click();

    }

    public void clickOnCommitteecheckbox() {

	Committee.click();

    }

    public void setCommitteeTextbox(String strCommitteeTextbox) {

	CommitteeTextbox.sendKeys(strCommitteeTextbox);

    }

    public void clickOnsaveButton() {

	saveButton.click();

    }

}
