package testNG;

import org.testng.annotations.Test;

public class TestNGCode {
  @Test(priority = 1)
  public void test() {
	  System.out.println("hello world");
  }
  @Test(priority = 2)
  public void name() {
	  System.out.println("name is rahul");
  }
}
