package testscriptpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mainpackage.LoginPage;

public class LoginPageTest extends Base {
  @Test(dataProvider = "credentials")
  public void enterUsernameAndPassword(String user,String pass) {
	  LoginPage login= new LoginPage(driver);
	  login.usernameAndPassword(user,pass);
	  login.clickButton();
  }
  @DataProvider(name="credentials")
	  public Object[][] testdata(){
	Object  data[][]= {{"admin","admin"},{"test","test"},{"admin","test"},{"test","admin"}};
	return data;
  }
  @Test
  @Parameters({"username","password"})
  public void enterCredentials(String User,String pass) {
	  LoginPage login = new LoginPage(driver);
	  login.usernameAndPassword(User, pass);
	  login.clickButton();
  }
  
}
