package stepdefinitions;

import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.ExcelUtils;

public class LoginSteps {

    LoginPage loginPage =
            new LoginPage(
                    DriverFactory.getDriver());

    @Given("user launches ParaBank application")
    public void launchApplication() {

        Assert.assertTrue(
                DriverFactory.getDriver()
                .getTitle()
                .contains("ParaBank"));
    }

    @When("user enters valid username and password")
    public void enterValidCredentials() {

        ExcelUtils.loadExcel(
        "src/test/resources/testdata/ParaBankData.xlsx",
        "LoginData");

        String username =
                ExcelUtils.getCellData(1,0);

        String password =
                ExcelUtils.getCellData(1,1);

        System.out.println(
        "Username: " + username);

        System.out.println(
        "Password: " + password);

        loginPage.enterUsername(username);

        loginPage.enterPassword(password);
    }

    @When("clicks login button")
    public void clickLoginButton() {

        loginPage.clickLogin();
    }

    @Then("user should navigate to account overview page")
    public void verifyLogin() {

        String actualUrl =
                DriverFactory.getDriver()
                .getCurrentUrl();

        System.out.println(actualUrl);

        Assert.assertTrue(
                actualUrl.contains("overview"),
                "Login Failed!");
    }
}