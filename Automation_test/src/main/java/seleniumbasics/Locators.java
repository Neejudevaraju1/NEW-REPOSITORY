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
	public void classLocator() {
		WebElement button=driver.findElement(By.className("btn btn-primary"));
	}
	public void linkText() {
		WebElement link=driver.findElement(By.linkText("simple-form-demo.php"));
		WebElement partiallink=driver.findElement(By.partialLinkText("radio"));
	}
	public void cssSelectorLocator() {
		WebElement tagid=driver.findElement(By.cssSelector("button#button-one"));
		WebElement tagattribute=driver.findElement(By.cssSelector("button[id=\"button-one\"]"));
		WebElement tagclass=driver.findElement(By.cssSelector("input.form-control[class=\"form-control\"]"));
		WebElement tagc=driver.findElement(By.cssSelector("input.form-control"));
		
	}
	public void xpath() {
		WebElement axpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));//absolute xpath
		WebElement Rxpath=driver.findElement(By.xpath("//button[@id='button-one']"));//relative xpath
		WebElement contains= driver.findElement(By.xpath("//input[contains(@id,'single-input')]"));//used to find Xpath that contains the value
        WebElement text=driver.findElement(By.xpath("//button[text()='Show Message']"));// using text method in which only tag and text is available 
        WebElement index=driver.findElement(By.xpath("//button[text()='Show Message']"));// using the index in xpath where the xpath matches more than one field

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
