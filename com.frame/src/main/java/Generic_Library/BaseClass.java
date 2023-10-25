package Generic_Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	
	public PropertyFileUtility pfutil=new PropertyFileUtility();
	public WebdriverUtility wdutil=new WebdriverUtility();
	
	@BeforeClass 
	public void configBC() throws Throwable
	{
		String brow=pfutil.getDataFromProperties("Browser");
		String urr=pfutil.getDataFromProperties("url");
		
		if (brow.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		else if(brow.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(brow.equals("Microsoft edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		sdriver=driver;
		driver.get(urr);
		wdutil.maximize_window(driver);
		wdutil.wait_implicitly(driver);
		System.out.println("browser is launched");	
	}
	
	@Test
	public void find()
	{
		System.out.println("printing");
	}
	
	@AfterClass
	public void AC()
	{
		driver.quit();
		System.out.println("browser closed");
	}
}
