package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import basePage.Base;
import webPage.FlatsPage;
import webPage.LoginPage;

public class FlatsTest {

    @Test
    public void Flats() throws InterruptedException {
	// launch browser

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");

	FlatsPage fPage = PageFactory.initElements(driver, FlatsPage.class);

	fPage.flat_test();

	fPage.create_flat_test();

	fPage.search_flat_no_test();

	fPage.edit_flat_and_pagination_test();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
	Base.quit();
    }

}