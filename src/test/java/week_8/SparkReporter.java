package week_8;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class SparkReporter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        // Specify the file path for the report
		        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./reports/SparkReport.html");
		        sparkReporter.config().setDocumentTitle("Automation Test Report");
		        sparkReporter.config().setReportName("Functional Test Report");

		        // Create ExtentReports object and attach the Spark reporter
		        ExtentReports extent = new ExtentReports();
		        extent.attachReporter(sparkReporter);

		        // Create a test case in the report
		        ExtentTest test = extent.createTest("Sample Test Case");
		        test.info("Test Case Started");
		        
		        try {
					test.pass("Test Case Passed");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					test.pass("Test Case failed");
				}

		        // Write the report to the specified file
		        extent.flush();
		        
				/*
				 * ExtentSparkReporter spark = new ExtentHtmlReporter("ExtentSpark.html");
				 * ExtentReports extent = new ExtentReports(); extent.attachReporter(spark);
				 * 
				 * extent.createTest("TestName").pass("Test Passed");
				 * 
				 * extent.flush();
				 */
		        

		        System.out.println("Report generated: SparkReport.html");
		    }
		

	}


