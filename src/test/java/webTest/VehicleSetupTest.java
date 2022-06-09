package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import basePage.Base;
import webPage.LoginPage;
import webPage.VehicleSetupPage;

public class VehicleSetupTest {

    @Test(groups = { "sanity" })
    public void VehicleSetup() throws InterruptedException {
	// launch browser

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");

	VehicleSetupPage vehicle_setup_test = PageFactory.initElements(driver, VehicleSetupPage.class);

	vehicle_setup_test.VehicleSetupPageTest();
	driver.wait(2000);
	vehicle_setup_test.VehicleTypeAddTest();

	vehicle_setup_test.VehicleTypeFunctionality();

	vehicle_setup_test.VehicleTypeAddTestWithoutOwner();

	vehicle_setup_test.VehicleTypeResetButton();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
	Base.quit();
    }

}