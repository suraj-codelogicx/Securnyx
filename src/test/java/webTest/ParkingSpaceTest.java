package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import basePage.Base;
import webPage.LoginPage;
import webPage.ParkingSpacePage;

public class ParkingSpaceTest {

    @Test(groups = { "sanity" })
    public void ParkingSpace() throws InterruptedException {
	// launch browser

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");

	ParkingSpacePage pspage = PageFactory.initElements(driver, ParkingSpacePage.class);
	pspage.parkingspace_test();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
	Base.quit();
    }

}