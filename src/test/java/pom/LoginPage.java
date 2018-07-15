package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;


public class LoginPage {

	/*public LoginPage(WebDriver driver) {
		super(driver);
	}*/
	
	/*WebElement signInLink = driver.findElement(By.id("signin-model-wishlist"));
	WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='login-email']"));
	WebElement pwdTextBox = driver.findElement(By.id("login-pwd"));
	WebElement loginBtn =driver.findElement(By.id("btn-login"));*/
	


	@FindBy(id ="signin-model-wishlist")
	 public WebElement signInLink;
	
	@FindBy(id ="login-email")
	 public WebElement emailTextBox;
	
	@FindBy(id ="login-pwd")
	 public WebElement pwdTextBox;
	
	@FindBy(id ="btn-login")
	 public WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	

		
		public void clickSignInLink() throws InterruptedException {
			Thread.sleep(2000);
			signInLink.click();
			Thread.sleep(2000);
		}
		
		public void enterUserEmail() {
			emailTextBox.sendKeys("Test1212rs@gmail.com");
		}
		
		public void enterUserPwd() {
			pwdTextBox.sendKeys("Test@1234");
		}
		
		public void clickLoginBtn() {
			loginBtn.click();
		}
}
