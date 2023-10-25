package Generic_Library;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	
public String getDataFromProperties(String key) throws Throwable
{
	FileInputStream fis=new FileInputStream(IpathConstant.PropertyfilePath);
	Properties p=new Properties();
	p.load(fis);
	String KEY=p.getProperty(key);
	return KEY;
}
}
