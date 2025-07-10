package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AutomationStudy {
  @Test
  public void testMethod() {
	  System.out.println("at test");
  }
  @Test
  public void secondMethod() {
	  System.out.println("Second method");
  }
  @Test
  public void print() {
	  System.out.println("neeju");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }

}
