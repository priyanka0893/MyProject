package automation_practise_website;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener{


	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		System.out.println("Test Failed: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 System.out.println("Test Skipped: " + result.getName());
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started: " + result.getName());
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed: " + result.getName());
		ITestListener.super.onTestSuccess(result);
	}

}

