package module1_login_test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library_files.BaseClass;
import library_files.UtilityClass;
import module1_login.KiteLogin1Page;
import module1_login.KitePinPage;

public class KiteLoginTest extends BaseClass
{
	KiteLogin1Page login1;
	KitePinPage login2;
	
	@BeforeMethod
	public void before() throws IOException
	{
		Reporter.log("Before method ",true);
		initializeBrowser();	
	     login1=new KiteLogin1Page(driver);
	    login2=new KitePinPage(driver);
	}
	@Test
	public void veriftyUserID() throws InterruptedException, IOException
	{
		
	    login1.inpKiteLogin1PageUserName(UtilityClass.getPFdata("UN"));
	    login1.inpKiteLogin1PagePassword(UtilityClass.getPFdata("PASSWORD"));
	    login1.clickKiteLogin1PageLoginBtn();
	    login2.inpKitePinPageCntBtn(UtilityClass.getPFdata("PIN"));
	    login2.clickKitePinPagecntBtn();
		
	}
	@AfterMethod
	public void CloseBrower()
	{
		driver.quit();
	}

}
