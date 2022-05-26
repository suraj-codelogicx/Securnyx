package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver ldriver) {
	this.driver = ldriver;
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement Username;

    @FindBy(how = How.XPATH, using = "(//input[@type='password'])[2]")
    WebElement Password;

    @FindBy(how = How.XPATH, using = "(//*[@name='button'])[2]")
    WebElement Login;

    public void login_to_360(String uid, String pas) throws InterruptedException {

	WebDriverWait wait = (new WebDriverWait(driver, 60));
	wait.until(ExpectedConditions.visibilityOf(Username));
	Username.sendKeys(uid);
	Password.sendKeys(pas);
	Thread.sleep(3000);
	Login.click();
	Thread.sleep(3000);

    }

}