package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@name='username']")WebElement username;
@FindBy(xpath="//input[@name='password']")WebElement password;
@FindBy(xpath="//button[@type='submit']")WebElement SignIn;
@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alertmessage;
public void usernameAndPassword(String usernamefield, String passwordField) {
	username.sendKeys(usernamefield);
	password.sendKeys(passwordField);
}
public void clickButton() {
	
	SignIn.click();
}
public boolean isDashboardIsDisplayed() {
	
	return dashboard.isDisplayed();
	
}
public boolean isAlertMessageIsDisplayed() {
	
	return alertmessage.isDisplayed();
}
}