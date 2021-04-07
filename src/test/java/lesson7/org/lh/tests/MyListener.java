package lesson7.org.lh.tests;

import lesson7.org.lh.app.Constants;
import lesson7.org.lh.webdriver.DriverHolder;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.internal.IResultListener;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class MyListener implements IResultListener {
//    static final Logger logger = (Logger) LoggerFactory.getLogger(MyListener.class);



    @Override
    public void onConfigurationSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onConfigurationFailure(ITestResult iTestResult) {

    }

    @Override
    public void onConfigurationSkip(ITestResult iTestResult) {

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
//        logger.info(iTestResult.getName() + " started!");

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
//        logger.info(iTestResult.getName() + " finished Success!");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
//        logger.warning(iTestResult.getName() + " fail!!!!");
        File screenShot = ((TakesScreenshot) DriverHolder.getInstance().getDriver())
                .getScreenshotAs(OutputType.FILE);
        File distFile;
        distFile = new File(Constants.screenshotsFolder, iTestResult.getName() + ".png");
        try {
            FileUtils.copyFile(screenShot, distFile);
//            logger.warning("Screenshot is saved here: " + distFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
