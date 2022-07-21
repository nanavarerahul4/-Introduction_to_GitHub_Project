package module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement cntBtn;

	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void inpKitePinPageCntBtn(String Pin)
	{
	   pin.sendKeys(Pin);	
	}
	public void clickKitePinPagecntBtn()
	{
		cntBtn.click();
	}
	
}
