package hooks;

import java.io.IOException;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;
import utils.ScreenshotUtil;

public class Hooks extends BaseClass {

    @Before
    public void setup() {

        ConfigReader.loadProperties();

        initializeBrowser();
    }

    @After
    public void tearDownScenario(
            Scenario scenario)
            throws IOException {

        if (scenario.isFailed()) {

            ScreenshotUtil.captureScreenshot(
                    scenario.getName());
        }

        tearDown();
    }
}