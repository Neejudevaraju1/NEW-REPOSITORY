package testscriptpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;

public class AdminUserPageTest extends Base {
  @Test
  public void createNewAdminUserInformation() {
	  LoginPage login=new LoginPage(driver);
	  login.usernameAndPassword("admin","admin");
	  login.clickButton();
	  AdminUserPage adminuser=new AdminUserPage(driver);
	  adminuser.clickOnAdmin();
	  adminuser.clickOnNew();
	  adminuser.enterUserAndPassword("HARRY", "tEst@123");
	  adminuser.selectFromDropdown("admin");
	  adminuser.clickSaveButton();
	  boolean isAlertDisplayed= adminuser.isAlertIsDisplayed();
	  Assert.assertTrue(isAlertDisplayed, "Unable to save the admin information");
	  
	  
  }
}
