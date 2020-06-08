package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilies {
	public void dropdown(WebElement ele,String vt)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(vt);
	}
	
	public void mousehover(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}

	public void rightclcik(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.contextClick(target).perform();
	}
	
	public void visibleofelements(WebDriver driver,WebElement ele)
	{
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitforbuttons(WebDriver driver,WebElement ele)
	{
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
}
