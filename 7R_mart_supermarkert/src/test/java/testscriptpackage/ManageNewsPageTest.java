package testscriptpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
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
	  Assert.assertTrue(isAlertDisplayed,Constant.EEROR_MESSAGE_FOR_UNABLE_TO_SAVE_NEWS );
  }
}
