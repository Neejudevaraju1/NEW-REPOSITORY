package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FinfElementsExample extends Base{
	public void findelements() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> box=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement i:box) {
			i.click();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinfElementsExample element= new FinfElementsExample();
		element.browserInitialisation();
		element.findelements();
	}

}
