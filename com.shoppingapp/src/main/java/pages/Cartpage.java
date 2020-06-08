package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	public WebDriver driver;
@FindBy(xpath="//i[@class='icon-plus']")
private WebElement plusbtn;

@FindBy(id="group_1")
private WebElement sizedd;

@FindBy(name="Pink")
private WebElement color;

@FindBy(xpath="//span[.='Add to cart']")
private WebElement cartbtn;

@FindBy(xpath="//a[@title='Proceed to checkout']")
private WebElement proceedtocheckout;

public Cartpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void plusbutton()
{
	plusbtn.click();
}
public WebElement getSizedd() {
	return sizedd;
}

public void productselection()
{
	color.click();
	cartbtn.click();
	proceedtocheckout.click();
}
}
