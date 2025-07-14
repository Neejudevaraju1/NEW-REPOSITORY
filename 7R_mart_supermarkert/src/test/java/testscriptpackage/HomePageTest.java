package testscriptpackage;

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
  }
}
