package Generic_Library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
	
//	JavaUtility jvutil=new JavaUtility();
//
//	public void onTestFailure(ITestResult result) 
//	{
//		String methodname =result.getMethod().getMethodName();
//		String sc=methodname+" "+jvutil.getsysdatetime();
//		
//		TakesScreenshot t=(TakesScreenshot)driver;
//		File src=t.getScreenshotAs(OutputType.FILE);
//		File dest=new File("./Screenshot/"+scr+".png");
//		FileUtils.copyFile(src, dest);
//		
//	}

}
