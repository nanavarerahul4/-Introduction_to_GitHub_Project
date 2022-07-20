package module1_login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginBtn;
	public  KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inpKiteLogin1PageUserName(String un) throws InterruptedException
	{
		UN.sendKeys(un);
		Thread.sleep(2000);
	}
	public void inpKiteLogin1PagePassword(String pass) throws InterruptedException
	{
		Password.sendKeys(pass);
		Thread.sleep(2000);
	}
	public void clickKiteLogin1PageLoginBtn()
	{
		loginBtn.click();
	}
	
	
}
