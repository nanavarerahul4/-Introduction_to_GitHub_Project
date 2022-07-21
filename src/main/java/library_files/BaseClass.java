package library_files;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{
		System.setProperty("webdriver.gecko.driver","E:\\Software Testing Rahul\\Automation Testing\\Sanjay Sir\\Selenium\\Selenium Setup Files\\Firefox\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    System.out.println("Entered in base class");
	    driver.get("https://kite.zerodha.com/");
	    //driver.get("https://kite.zerodha.com/");
	}

}
