package testscriptpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsPageTest extends Base {
  @Test
  public void verifyThatTheUserCanSaveNews() {
	  LoginPage loginpage=new LoginPage(driver);
	  ManageNewsPage managenews=new ManageNewsPage(driver);
	  loginpage.usernameAndPassword("admin", "admin");
	  loginpage.clickButton();
	  managenews.clickMoreInfo();
	  managenews.clickNewButton();
	  managenews.enterNewsToTheField(" Welcome to the world NEWS");
	  managenews.clickSaveButton();
	  boolean isAlertDisplayed= managenews.isAlertIsDiplayedAfterSaving();
	  Assert.assertTrue(isAlertDisplayed, "UNABLE TO SAVE NEWS");
  }
}
