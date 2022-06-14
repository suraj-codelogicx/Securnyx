package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    public static WebDriver driver;

    @BeforeSuite
    public static WebDriver startBrowser(String browserName, String url) {

	if (browserName.equalsIgnoreCase("firefox")) {
	    WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
	} else if (browserName.equalsIgnoreCase("chrome")) {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    driver = new ChromeDriver(options);
	} else if (browserName.equalsIgnoreCase("IE")) {
	    WebDriverManager.iedriver().setup();
	    driver = new InternetExplorerDriver();
	} else if (browserName.equalsIgnoreCase("edge")) {
	    WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get(url);

	return driver;

    }

    public static void quit() {
	driver.quit();

    }
//
//    public static void close() {
//	driver.close();
//    }

}
