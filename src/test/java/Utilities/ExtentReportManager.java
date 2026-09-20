package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportManager {

    private static ExtentReports extent;
    private static ExtentTest test;

    private static String reportPath;

    public static void startReport() {

        // Create reports folder
        File reportFolder = new File("reports");

        if (!reportFolder.exists()) {
            reportFolder.mkdirs();
        }

        // Create unique date and time
        String timeStamp = new SimpleDateFormat(
                "yyyy.MM.dd.HH.mm.ss"
        ).format(new Date());

        // Report file path
        reportPath = "reports/Test-Report-" + timeStamp + ".html";

        // Create Extent Report
        ExtentSparkReporter spark =
                new ExtentSparkReporter(reportPath);

        extent = new ExtentReports();
        extent.attachReporter(spark);

        // System Information
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

    // Get current report path
    public static String getReportPath() {

        return reportPath;
    }
}