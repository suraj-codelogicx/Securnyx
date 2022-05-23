package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePage.Base;
import webPage.LoginPage;

public class LoginTest {
    @Test
    public void init() throws InterruptedException {

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	loginpage.setEmail("surajbiswas@yopmail.com");
	Thread.sleep(5000);
	loginpage.setPassword("suraj8877");
	Thread.sleep(5000);
	loginpage.clickOnLoginButton();
	Thread.sleep(5000);
	loginpage.imageButton();
	Thread.sleep(5000);
	loginpage.clickOnsignoutButton();

    }
}
