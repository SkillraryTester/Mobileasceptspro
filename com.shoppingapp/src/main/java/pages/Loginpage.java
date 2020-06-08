package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
public WebDriver driver;
@FindBy(xpath="//a[contains(.,'Sign in')] ")
private WebElement signbtn;

@FindBy(id="email")
private WebElement emailtb;

@FindBy(id="passwd")
private WebElement passwordtb;

@FindBy(id="SubmitLogin")
private WebElement loginbtn;

public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	this.driver=driver;
}
public Homepage logincredentials(String us,String pwd)
{
	signbtn.click();
	emailtb.sendKeys(us);
	passwordtb.sendKeys(pwd);
	loginbtn.click();
	return new Homepage(driver);
}

}
