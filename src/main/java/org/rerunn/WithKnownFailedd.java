package org.rerunn;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class WithKnownFailedd implements IRetryAnalyzer{

	int mincount=1,maxcount=5;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(mincount<maxcount) {
			mincount=mincount+1;
			
			return true;   //test fail condition pass
		}
		return false;     //test pass condition fail
	}
}
