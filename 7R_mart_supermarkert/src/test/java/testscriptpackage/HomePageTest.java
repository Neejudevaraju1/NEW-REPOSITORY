package testscriptpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base {
  @Test
  public void clickOnAdminAndLogout() {
	  LoginPage login=new LoginPage(driver);
	  login.usernameAndPassword("admin", "admin");
	  login.clickButton();
	  HomePage home=new HomePage(driver);
	  home.clickAdmin();
	  home.clickLogOut();
	  //System.out.println(driver.getTitle());
	  String expected="Login | 7rmart supermarket";
	  String actual=driver.getTitle();
	  Assert.assertEquals(expected, actual, "logout failed");
  }
}
