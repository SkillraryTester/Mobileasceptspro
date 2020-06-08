package genericlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class Propertyfile implements Autoconstant{
	
	public String getdata(String key)
	{
		Properties p=new Properties();
		try {
		p.load(new FileInputStream(propertyfilepath));
		}
		catch(Exception e)
		{
			Reporter.log("data is not fretched",true);
		}
		return p.getProperty(key);
	}}
