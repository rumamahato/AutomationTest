package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomerTestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {

        ExtentReportManager.startReport();
    }

    @Override
    public void onTestStart(ITestResult result) {

        ExtentReportManager.createTest(result.getName());

        ExtentReportManager.getTest()
                .info("Test Started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentReportManager.getTest()
                .pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        ExtentReportManager.getTest()
                .fail("Test Failed");

        if (result.getThrowable() != null) {
            ExtentReportManager.getTest()
                    .fail(result.getThrowable());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        ExtentReportManager.getTest()
                .skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {

        // Save report
        ExtentReportManager.endReport();

        // Send current report by email
        EmailUtils.sendTestReportEmail(
                ExtentReportManager.getReportPath()
        );
    }
}