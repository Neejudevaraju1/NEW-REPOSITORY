package demoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {
  @Test
  public void verifyUserCanLogin() {
	  WebElement username=driver.findElement(By.xpath("//input[@id='loginform-username']"));
	  username.sendKeys("carol");
	  WebElement password=driver.findElement(By.xpath("//input[@id='loginform-password']"));
	  password.sendKeys("1q2w3e4r");
	  WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();
	  }
}
