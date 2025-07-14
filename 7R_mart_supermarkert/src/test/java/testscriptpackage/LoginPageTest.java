package testscriptpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends Base {
	@Test
	public void VerifyUserCanLoginWithValidCredentials() {
		LoginPage login=new LoginPage(driver);
		login.usernameAndPassword("admin", "admin");
		login.clickButton();
	}
	
  @Test(dataProvider = "credentials")
  public void verifyUserCanLoginWithValidUsernameAndInvalidPassword(String user,String pass) {
	  LoginPage login= new LoginPage(driver);
	  login.usernameAndPassword(user,pass);
	  login.clickButton();
  }
  @DataProvider(name="credentials")
	  public Object[][] testdata(){
	Object  data[][]= {{"test","test"},{"admin","test"},{"test","admin"}};
	return data;
  }
  @Test
  @Parameters({"username","password"})
  public void loginwithInvalidCredentials(String User,String pass) {
	  LoginPage login = new LoginPage(driver);
	  login.usernameAndPassword(User, pass);
	  login.clickButton();
  }
  
}
