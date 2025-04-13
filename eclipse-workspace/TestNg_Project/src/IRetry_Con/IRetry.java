package IRetry_Con;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry implements IRetryAnalyzer {

	int retry=2;
	int count=0;
	@Override
	public boolean retry(ITestResult result) {
		if(count<retry)
		{
			count++;
			return true;
		}
		return false;
	}
	
	

}
