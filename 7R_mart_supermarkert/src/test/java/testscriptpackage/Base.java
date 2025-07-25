package testscriptpackage;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Base {
  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
