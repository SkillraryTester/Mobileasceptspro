package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Exceldata;
import genericlib.Propertyfile;
import genericlib.Utilies;
import pages.Cartpage;
import pages.Homepage;
import pages.Loginpage;
import pages.Productpage;

public class Addingtheproductcart extends Basetest{
	@Test
	public void addingcart()
	{
		Propertyfile p=new Propertyfile();
		Utilies u=new Utilies();
		Loginpage l=new Loginpage(driver);
		Homepage h = l.logincredentials(p.getdata("username"),p.getdata("password"));
		String act = driver.getTitle();
		Exceldata e=new Exceldata();
		//Assert.assertEquals(act,e.getexceldata("Sheet1",1,0));
		Productpage pr = h.seraching(p.getdata("product"));
		u.dropdown(pr.getSortdd(),p.getdata("sort"));
		Cartpage c = pr.selecting();
		for(int i=0;i<=3;i++)
		{
		c.plusbutton();
		}
		c.productselection();
		//Assert.assertEquals("Order - My Store",e.getexceldata("Sheet1",1,1));
	}

}
