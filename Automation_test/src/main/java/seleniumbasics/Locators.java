package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	public void idlocators() {
	WebElement messagefield=driver.findElement(By.id("single-input-field"));
	WebElement value_a=driver.findElement(By.id("value-a"));
	WebElement value_b=driver.findElement(By.id("value-b"));
	}
	public void nameLocator() {
		WebElement name=driver.findElement(By.name("description"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
