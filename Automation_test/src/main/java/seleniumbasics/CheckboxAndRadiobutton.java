package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxAndRadiobutton extends Base{
	public void checkBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.id("gridCheck"));
		checkbox.click();
	}
	public void radioButton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton=driver.findElement(By.id("inlineRadio1"));
		radiobutton.click();
	}

	public static void main(String[] args) {
		CheckboxAndRadiobutton check=new CheckboxAndRadiobutton();
		check.browserInitialisation();
        check.checkBox();
        check.radioButton();
	}

}
