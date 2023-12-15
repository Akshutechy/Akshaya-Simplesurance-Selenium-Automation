package reports;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public final class ExtentManager {
    private ExtentManager(){}

    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    static ExtentTest getExtentTest(){
        return extentTest.get();
    }

    static void setExtentTest(ExtentTest extentTestRef){
        extentTest.set(extentTestRef);
    }

    static void unload(){
        extentTest.remove();
    }
}
