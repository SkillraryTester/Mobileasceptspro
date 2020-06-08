package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logininvalidpage {
	public WebDriver driver;
	@FindBy(xpath="//a[contains(.,'Sign in')] ")
	private WebElement signbtn;

	@FindBy(id="email123")
	private WebElement emailtb;
	
	public Logininvalidpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void sample(String us)
	{
		signbtn.click();
	emailtb.sendKeys(us);
	}
}
