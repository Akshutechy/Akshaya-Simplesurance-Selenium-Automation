package constants;

import enums.ConfigProperties;
import utils.ReadPropertyFile;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FrameworkConstants {
    private FrameworkConstants(){}

    private static final String CONFIGFILEPATH = System.getProperty("user.dir")+"/src/test/resources/config/config.properties";
    private static final int TIMEOUTINSECONDS = 10;
    private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir")+"/extent-test-output/";
    private static String extentReportFilePath="";

    public static String getConfigFilePath(){return CONFIGFILEPATH;}

    public static int getTimeout(){return TIMEOUTINSECONDS;}

    public static String getExtentReportFilePath() throws Exception {
        if(extentReportFilePath.isEmpty()){
            extentReportFilePath=createReportPath();
        }
        return extentReportFilePath;
    }

    private static String createReportPath() throws Exception {
        if(ReadPropertyFile.getValue(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes")){
            return EXTENTREPORTFOLDERPATH+"index.html";
        }
        else {
            SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyy_HH_mm_ss");
            Date date = new Date();
            return EXTENTREPORTFOLDERPATH+formatter.format(date)+"_"+"index.html";
        }
    }

}
