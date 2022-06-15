package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import basePage.Base;
import webPage.GuardProfilePage;
import webPage.LoginPage;

public class GuardProfileTest {

    @Test(groups = { "sanity" })
    public void GuardProfile() throws InterruptedException {
	// launch browser

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");

	GuardProfilePage gpb = PageFactory.initElements(driver, GuardProfilePage.class);

	gpb.guard_profile_test();

	gpb.addGuard_test();

	gpb.clearScreen();

	gpb.addGuard_test_noFirstName();

	gpb.clearScreen();

	gpb.addGuard_test_noLastName();

	gpb.clearScreen();

	gpb.addGuard_test_noPhoneNumber();

	gpb.clearScreen();

	gpb.addGuard_allBlank();

	gpb.editGuard();

    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
	Base.quit();
    }

}