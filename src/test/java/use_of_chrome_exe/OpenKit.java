package use_of_chrome_exe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenKit 
{
	@Test
	public void openKit()
	{
		System.setProperty("webdriver.gecko.driver","E:\\Software Testing Rahul\\Automation Testing\\Sanjay Sir\\Selenium\\Selenium Setup Files\\Firefox\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.2.0");
	}

}
