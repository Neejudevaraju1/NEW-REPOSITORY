package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extend_Report_Utility {
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("SevenRMartSuperMarket");
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("organization", "Obsqura");
		extentReports.setSystemInfo("Name", "Neeju");
		return extentReports;
	}
}