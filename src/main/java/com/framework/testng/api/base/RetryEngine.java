package com.framework.testng.api.base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryEngine implements IRetryAnalyzer {
	 
    private int count = 1000;
    private static int maxTry = 70;
 
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {                     
            if (count < maxTry) {                            
                count++;                                     
                iTestResult.setStatus(ITestResult.FAILURE);  
                return true;                                
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);  
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);      
        }
        return false;
    }
 
}
