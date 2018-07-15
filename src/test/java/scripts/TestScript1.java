package scripts;

import org.testng.annotations.Test;
import generics.BaseTest;
import pom.LoginPage;

public class TestScript1 extends BaseTest{
	
		@Test (enabled=true)
		public void LoginToJabong() throws InterruptedException {
			LoginPage di = new LoginPage(driver);
			Thread.sleep(10000);
			di.clickSignInLink();
			Thread.sleep(8000);
			di.enterUserEmail();
			di.enterUserPwd();
			di.clickLoginBtn();
		}
	}
