package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns extends Base {
	
	public void dropDown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement select1 =driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(select1);
		//select.selectByIndex(1);     //by index from the dropdown list
		select.selectByValue("Yellow");    // using the value displayed in the dropdown
		select.selectByVisibleText("Green");  // using visible text that is displayed in black letters 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdowns dropdown= new HandlingDropdowns();
		dropdown.browserInitialisation();
		dropdown.dropDown();
	}

}
