package scripts;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Propertyfile;
import genericlib.Utilies;
import pages.Homepage;
import pages.Loginpage;
import pages.Summerpage;

public class Deliverytheproduct  extends Basetest{
@Test
public void productdeliver()
{
	Propertyfile p=new Propertyfile();
	Utilies u=new Utilies();
	Loginpage l=new Loginpage(driver);
	Homepage h = l.logincredentials(p.getdata("username"),p.getdata("password"));
	u.mousehover(driver,h.getDressmh());
	Summerpage s = h.summerdress();
	s.delivery();
}
}
