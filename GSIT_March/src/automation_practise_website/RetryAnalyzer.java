package automation_practise_website;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 3; 

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            System.out.println("Retrying test " + result.getName() + " with status "
                    + result.getStatus() + " for the " + (retryCount + 1) + " time(s).");
            retryCount++;
            return true;
        }
        return false;
    }
}
