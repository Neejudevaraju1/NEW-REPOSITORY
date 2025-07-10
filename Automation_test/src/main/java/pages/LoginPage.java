package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver){                         //
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//input[@id='loginform-username']")  WebElement username ; //user to find locators we can also make the webelement private
@FindBy(xpath="//input[@id='loginform-password']")  WebElement password;
@FindBy(xpath="//button[@type='submit']") WebElement login;

public void enterUsernameAndPassword(String usernamefield,String passwordfield) {
	
	username.sendKeys(usernamefield);
	password.sendKeys(passwordfield);
}

public void clickLoginButton() {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(login));
	login.click();
}
}
