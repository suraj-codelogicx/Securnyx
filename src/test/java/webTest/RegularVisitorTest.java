package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import basePage.Base;
import webPage.LoginPage;
import webPage.RegularVisitorLog;

public class RegularVisitorTest {

    @Test(priority = 1)
    public void RegularVisitors() throws InterruptedException {
	// launch browser

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");

	RegularVisitorLog rVL = PageFactory.initElements(driver, RegularVisitorLog.class);

	rVL.regular_visitors_log_test();

    }

    @Test(priority = 2)
    public void RegularVisitorsSort() throws InterruptedException {
	// launch browser

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");

	RegularVisitorLog rVL = PageFactory.initElements(driver, RegularVisitorLog.class);

	rVL.regular_visitors_log_test();

	rVL.regular_visitors_sort_test();

    }

    @Test(priority = 3)
    public void RegularVisitorsSearch() throws InterruptedException {
	// launch browser

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");

	RegularVisitorLog rVL = PageFactory.initElements(driver, RegularVisitorLog.class);

	rVL.searchByNameAndCategoryTest();

    }

    @Test(priority = 4)
    public void RegularVisitorsDetails() throws InterruptedException {
	// launch browser

	WebDriver driver = Base.startBrowser("chrome", "https://dev.the360.in/login");

	// created page object using page factory
	LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
	// call the method
	login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");

	RegularVisitorLog rVL = PageFactory.initElements(driver, RegularVisitorLog.class);

	rVL.regular_visitors_details_test();

    }

    @AfterMethod(alwaysRun = true)
    public void teardown() {
	Base.quit();
    }

}