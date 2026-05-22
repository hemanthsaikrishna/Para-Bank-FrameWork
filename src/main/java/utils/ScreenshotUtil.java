package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import base.DriverFactory;

public class ScreenshotUtil {

    public static void captureScreenshot(
            String fileName)
            throws IOException {

        TakesScreenshot ts =
                (TakesScreenshot)
                        DriverFactory.getDriver();

        File src =
                ts.getScreenshotAs(OutputType.FILE);

        File dest =
                new File(
                "screenshots/" + fileName + ".png");

        FileUtils.copyFile(src, dest);
    }
}