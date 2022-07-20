package module1_login_test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import library_files.BaseClass;
import library_files.UtilityClass;
import module1_login.KiteLogin1Page;

public class KiteLoginTest extends BaseClass
{
	@Test
	public void veriftyUserID() throws InterruptedException, IOException
	{
		initializeBrowser();	
	    KiteLogin1Page login1=new KiteLogin1Page(driver);
	    login1.inpKiteLogin1PageUserName(UtilityClass.getPFdata("UN"));
	    login1.inpKiteLogin1PagePassword(UtilityClass.getPFdata("PASSWORD"));
	    login1.clickKiteLogin1PageLoginBtn();
		
	}

}
