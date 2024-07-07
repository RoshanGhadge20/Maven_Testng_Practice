package iRetryAnalyzer;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class iretryAnalyzer_example implements IRetryAnalyzer {

	int retry_count=0;
	int max_retry_count=1;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retry_count<max_retry_count)
		{
			retry_count++;
			return true;
		}
		return false;
	}
	
}
