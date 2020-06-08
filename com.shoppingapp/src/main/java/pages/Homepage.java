package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	@FindBy(id="search_query_top")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement serachbtn;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dressmh;
	
	public WebElement getDressmh() {
		return dressmh;
	}

	@FindBy(xpath="(//a[@title='Summer Dresses'])[2]")
	private WebElement summerdress;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	 public Productpage seraching(String product)
	 {
		 serachtb.sendKeys(product);
		 serachbtn.click();
		 return new Productpage(driver);
	 }
	 
	 public Summerpage summerdress()
	 {
		 summerdress.click();
		 return new Summerpage(driver);
	 }
}
