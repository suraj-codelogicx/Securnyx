package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import basePage.Base;
import webPage.LoginPage;
import webPage.TenantsPage;

public class TenantsTest {

    @Test
    public void Property() throws InterruptedException {
	// launch browser

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");

	TenantsPage tPage = PageFactory.initElements(driver, TenantsPage.class);
	tPage.add_tenants_test();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
	Base.quit();
    }

}