package com.BaseClass;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Utilities.PropertiesUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Baseclass {

	public static WebDriver driver = null;
	
	
	public static ExtentReports report = null;
	public static ExtentSparkReporter spark = null;
	public static ExtentTest test = null;
	public static Logger log = Logger.getLogger("BaseClass");

	public static void initialization() {
		
log.info("well done my boy");
System.out.println("log info");
		String browserName = PropertiesUtils.readProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver127.exe");
			driver = new ChromeDriver();

		}
		if (browserName.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();

		}
		if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:/msedgedriver.exe");
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
		driver.get(PropertiesUtils.readProperty("url"));
		
	}
	
	public void reportInit() {
		report = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReports.html");
		report.attachReporter(spark);
	}
	public static void main(String[] args) {
		initialization();
	}
}