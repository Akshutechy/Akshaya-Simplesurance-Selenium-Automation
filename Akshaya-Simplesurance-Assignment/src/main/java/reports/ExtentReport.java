package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import constants.FrameworkConstants;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ExtentReport {
    private ExtentReport(){}

    private static ExtentReports extent;
    public static void initReports(){
        if(Objects.isNull(extent)){
            extent = new ExtentReports();
            ExtentSparkReporter spark = null;
            try {
                spark = new ExtentSparkReporter(FrameworkConstants.getExtentReportFilePath());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            extent.attachReporter(spark);
            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("Simplesurance Automation Report");
            spark.config().setReportName("Simplesurance Selenium Automation Test Report");
        }
    }

    public static void flushReports() throws Exception {
        if(Objects.nonNull(extent)){
            extent.flush();
            Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());
            ExtentManager.unload();
        }
    }

    public static void createTest(String testCaseName){
        ExtentTest test = extent.createTest(testCaseName);
        ExtentManager.setExtentTest(test);
    }
}
