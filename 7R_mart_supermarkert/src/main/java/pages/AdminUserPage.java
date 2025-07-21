package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtilities;

public class AdminUserPage {
	WebDriver driver;
	PageUtilities utility= new PageUtilities();
	
public AdminUserPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'])[2]")WebElement adminuser;
@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
@FindBy(xpath="//input[@name='username']")WebElement user_Name;
@FindBy(xpath="//input[@name='password']")WebElement password;
@FindBy(xpath="//select[@name='user_type']")WebElement userType;
@FindBy(xpath="//button[@name='Create']") WebElement save;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;

 public void clickOnAdmin() {
	 adminuser.click();
 }
 public void clickOnNew() {
	 newbutton.click();
 }
 public void enterUserAndPassword(String username,String passwd) {
	 user_Name.sendKeys(username);
	 password.sendKeys(passwd);
 }
 public void selectFromDropdown(String typevalue) {
	utility.selectByValue(userType, typevalue);
 }
 public void clickSaveButton() {
	 save.click();
 }
 public boolean isAlertIsDisplayed() {
		return alert.isDisplayed();
	}
}
