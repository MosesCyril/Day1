package week_8;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ExtentHtmlReporter reporter = new ExtentHtmlReporter();
		ExtentSparkReporter spark = new ExtentSparkReporter("SparkReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
	}

}
