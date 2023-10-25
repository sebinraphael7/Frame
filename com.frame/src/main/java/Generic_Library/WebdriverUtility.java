package Generic_Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WebdriverUtility {
	
	public void maximize_window(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void wait_implicitly(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
}
