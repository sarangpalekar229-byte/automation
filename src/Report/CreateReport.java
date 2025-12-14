package Report;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class CreateReport  {
	public static  void main(String[]args) throws IOException {
		String projectpath = System.getProperty("user.dir");
		String reportsDir = projectpath +"\\Report";
		String screenshotDir = reportsDir +"\\ScreenShot";
		ExtentSparkReporter spark = new ExtentSparkReporter(reportsDir +"\\TestReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Google Test");
		System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.amazon.com");
			test.pass("Navigated to Amazon");
			String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
			String screenshotPath = screenshotDir + "\\Google_" + timestamp +".png";
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(screenshotPath);
			Files.copy(src, dest);
			test.addScreenCaptureFromPath(screenshotPath, "Google Home Page Screenshot");
			test.pass("Screenshot Captured");
			
		} catch(Exception e) {
			test.fail("Test failed : "+ e.getMessage());
		} finally {
			driver.quit();
			test.pass("Browser Closed");
			extent.flush();
		}
		System.out.println("Report and screenshot generated successfully in " + reportsDir);
		
	}
	
	

}

