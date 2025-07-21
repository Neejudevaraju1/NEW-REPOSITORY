package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities {

	public void selectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void selectFromDropDown_ByIndex(WebElement element, int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void selectFromDropDown_ByVisibleText(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
}
