package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base {
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement first=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(first).click();
		actions.doubleClick(first).perform();
		WebElement dropto=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		actions.dragAndDrop(first, dropto).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragAndDrop drag= new DragAndDrop();
		drag.browserInitialisation();
		drag.dragAndDrop();
	}

}
