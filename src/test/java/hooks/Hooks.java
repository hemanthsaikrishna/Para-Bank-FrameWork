package hooks;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class Hooks extends BaseClass {

    @Before
    public void setup() {

        ConfigReader.loadProperties();

        initializeBrowser();
    }

    @After
    public void closeBrowser() {

        tearDown();
    }
}