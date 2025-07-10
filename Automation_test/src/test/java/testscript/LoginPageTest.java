package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends Base {
  @Test
  public void verifyUserCanLoginWithValidCredentials() {
	/*  WebElement username=driver.findElement(By.xpath("//input[@id='loginform-username']"));
	  username.sendKeys("carol");
	  WebElement password=driver.findElement(By.xpath("//input[@id='loginform-password']"));
	  password.sendKeys("1q2w3e4r");
	  WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();*/
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameAndPassword("carol", "1q2w3e4r");
	  login.clickLoginButton();   
}
  @Test
  public void verifyUserCanLoginWithValidUsernameAndInvalidPassword() {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameAndPassword("carol", "pass");
	  login.clickLoginButton();
  }
  @Test
  @Parameters({"username","password"})
  public void verifyUserCanLoginWithInvalidUsenameAndValidPassword(String username, String password) {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameAndPassword(username,password);
	  login.clickLoginButton();
  }
  @Test(dataProvider = "credentials")
  public void verifyUserCanLoginWithInvalidCredentials(String username,String password) {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsernameAndPassword(username,password);
	  login.clickLoginButton();
  }
  @DataProvider(name="credentials")
  public Object[][] testData(){
	  Object data[][]= {{"carlo","1q2w3e4r"},{"carlo","pass"},{"test","1q2w3e4r"},{"test","pass"}};
	  return data;
  }
}
