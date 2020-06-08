package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summerpage {
@FindBy(id="layered_id_attribute_group_1")
private WebElement sizebtn;

@FindBy(id="layered_id_attribute_group_16")
private WebElement colorbtn;

@FindBy(xpath="//a[@title='Delivery']")
private WebElement deliverybtn;

public Summerpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void delivery()
{
	sizebtn.click();
	colorbtn.click();
	deliverybtn.click();
}

}
