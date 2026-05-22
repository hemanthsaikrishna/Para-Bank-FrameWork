package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;

import base.DriverFactory;

public class WaitUtils {

    public static void waitForElement(By locator) {

        WebDriverWait wait =
                new WebDriverWait(
                        DriverFactory.getDriver(),
                        Duration.ofSeconds(20));

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(locator));
    }
}