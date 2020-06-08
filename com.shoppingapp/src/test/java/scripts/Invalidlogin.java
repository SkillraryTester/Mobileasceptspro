package scripts;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Propertyfile;
import pages.Logininvalidpage;
import pages.Loginpage;

public class Invalidlogin extends Basetest{
@Test
public void invalid()
{
	Propertyfile p=new Propertyfile();
	Logininvalidpage l=new Logininvalidpage(driver);
	l.sample(p.getdata("inusername"));
}
}