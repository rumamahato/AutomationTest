package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;
    private static ExtentTest test;

    public static void startReport() {

        ExtentSparkReporter spark =
                new ExtentSparkReporter("test-output/ExtentReport.html");

        extent = new ExtentReports();
        extent.attachReporter(spark);

        extent.setSystemInfo("Project", "Automation Test");
        extent.setSystemInfo("Tester", "Ruma");
        extent.setSystemInfo("Environment", "QA");
    }

    public static void createTest(String testName) {
        test = extent.createTest(testName);
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static void endReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}