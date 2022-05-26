package webTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VehicleSetupTest {

}

    }

public void VehicleSetup_test() throws InterruptedException {

	Thread.sleep(7000);
	Actions actions = new Actions(driver);
	WebElement menuOption = property;
	Thread.sleep(3000);
	actions.moveToElement(menuOption).perform();
	Thread.sleep(3000);
	WebElement subMenuOption = vehiclesetup;
	actions.moveToElement(subMenuOption).perform();
	subMenuOption.click();
	Thread.sleep(3000);
}