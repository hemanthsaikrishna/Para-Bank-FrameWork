package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import pages.LogoutPage;

import base.DriverFactory;

public class LogoutSteps {

    LogoutPage logoutPage =
            new LogoutPage(
                    DriverFactory.getDriver());



    @And("user clicks logout link")
    public void clickLogoutLink() {

        logoutPage.clickLogout();
    }



    @Then("user should logout successfully")
    public void verifyLogout() {

        Assert.assertTrue(

                logoutPage.isLoginButtonDisplayed(),

                "Logout Failed"
        );
    }
}