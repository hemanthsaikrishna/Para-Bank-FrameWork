package stepdefinitions;

import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

public class RegistrationSteps {

    RegistrationPage registrationPage =
            new RegistrationPage(
                    DriverFactory.getDriver());

    @When("user navigates to registration page")
    public void navigateToRegistrationPage() {

        registrationPage.clickRegisterLink();
    }

    @When("user enters registration details")
    public void enterRegistrationDetails() {

        registrationPage.enterRegistrationDetails();
    }

    @When("clicks register button")
    public void clickRegisterButton() {

        registrationPage.clickRegisterButton();
    }

    @Then("user should register successfully")
    public void verifyRegistration() {

        String currentUrl =
                DriverFactory.getDriver()
                .getCurrentUrl();

        System.out.println(
                "Current URL: "
                + currentUrl);

        String welcomeText =
                registrationPage
                .getWelcomeMessage();

        System.out.println(
                "Welcome Text: "
                + welcomeText);

        Assert.assertTrue(
                currentUrl.contains("register"),
                "Registration Failed");

        Assert.assertTrue(
                welcomeText.contains("Welcome"),
                "Welcome message not displayed");
    }
}