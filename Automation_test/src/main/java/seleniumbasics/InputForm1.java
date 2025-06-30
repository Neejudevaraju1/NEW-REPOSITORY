package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm1 extends Base {
	 public void inputForm() {
		 driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 List<WebElement> entermessage =driver.findElements(By.className("form-control"));
		 for(WebElement i: entermessage) {
			 i.sendKeys("Hello World");
		 }
	 }

	public static void main(String[] args) {
		InputForm1 input =new InputForm1();
		input.browserInitialisation();
		input.inputForm();

	}

}
