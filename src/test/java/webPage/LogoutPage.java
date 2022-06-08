package webPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver ldriver) {
	this.driver = ldriver;
    }

    @FindBy(xpath = "//a//img[@class='user-image circle-image']")
    WebElement Account;

    @FindBy(how = How.XPATH, using = "//a[text()= 'Sign out']")
    WebElement Signout;

    public void logout_to_360() throws InterruptedException {
	Thread.sleep(7000);
	Account.click();
	Thread.sleep(3000);
	Signout.click();

    }

}