package Generic_Library;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnlyzerImplementationClass implements IRetryAnalyzer {
	int counter=0;
	int retry_limit=4;
	public boolean retry(ITestResult result)
	{
		if (counter<retry_limit)
		{
			counter++;
			return true;
		}
		return false;
	}

}
