package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {



    public static ExtentReports getReportObject() {
String path = System.getProperty("user.dir")+"//reports//index.html";
ExtentSparkReporter reporter = new ExtentSparkReporter(path);
reporter.config().setReportName("RajnjithPomProject");
reporter.config().setDocumentTitle("ExtentDoucmentTitle");

ExtentReports extent = new ExtentReports();
extent.attachReporter(reporter);
extent.setSystemInfo("systemifo Ranjith", "System info");
return extent;

    }
}