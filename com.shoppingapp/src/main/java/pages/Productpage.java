package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	public WebDriver driver;
	@FindBy(id="selectProductSort")
	private WebElement sortdd;
	
	public WebElement getSortdd() {
		return sortdd;
	}

	@FindBy(xpath="(//a[@title='Printed Dress'])[2]")
	private WebElement dress;
	
	public  Productpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public Cartpage selecting()
	{
		dress.click();
		return new Cartpage(driver);
	}

}
