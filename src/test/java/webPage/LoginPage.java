package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
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

    @FindBy(xpath = "//img[@alt='User Image']")
    @CacheLookup
    WebElement Imagebutton;

    @FindBy(xpath = "//a[normalize-space()='Sign out']")
    @CacheLookup
    WebElement Logoutbutton;

    public void setEmail(String strEmail) {

	Username.sendKeys(strEmail);
    }

    public void setPassword(String strPassword) {

	Password.sendKeys(strPassword);
    }

    public void clickOnLoginButton() {

	Loginbutton.click();

    }

    public void imageButton() {

	Imagebutton.click();

    }

    public void clickOnsignoutButton() {

	Logoutbutton.click();

    }

}