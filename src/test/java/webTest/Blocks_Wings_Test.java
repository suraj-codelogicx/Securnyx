package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import basePage.Base;
import webPage.Blocks_Wings_Page;
import webPage.LoginPage;

public class Blocks_Wings_Test {

    @Test(groups = { "sanity" })
    public void BlockTests() throws InterruptedException {
	// launch browser

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");

	Blocks_Wings_Page b_page = PageFactory.initElements(driver, Blocks_Wings_Page.class);
	b_page.BlocksTest();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
	Base.quit();
    }
}
