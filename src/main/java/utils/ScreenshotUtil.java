package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.DriverFactory;

public class ScreenshotUtil {

    public static String captureScreenshot(
            String screenshotName)
            throws IOException {

        String timestamp =
                new SimpleDateFormat(
                        "yyyyMMdd_HHmmss")
                        .format(new Date());

        String filePath =
                "screenshots/"
                + screenshotName
                + "_"
                + timestamp
                + ".png";

        TakesScreenshot ts =
                (TakesScreenshot)
                        DriverFactory.getDriver();

        File src =
                ts.getScreenshotAs(OutputType.FILE);

        File dest = new File(filePath);

        FileUtils.copyFile(src, dest);

        System.out.println(
                "Screenshot saved: "
                + filePath);

        return filePath;
    }
}