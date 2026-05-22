package base;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public static ThreadLocal<WebDriver> driver =
            new ThreadLocal<>();

    public static WebDriver getDriver() {

        return driver.get();
    }

    public static void setDriver(WebDriver driverRef) {

        driver.set(driverRef);
    }

    public static void unload() {

        driver.remove();
    }
}
