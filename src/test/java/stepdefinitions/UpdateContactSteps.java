package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import pages.UpdateContactPage;
import base.DriverFactory;

public class UpdateContactSteps {

    UpdateContactPage updatePage =
            new UpdateContactPage(
            DriverFactory.getDriver());

    @And("user navigates to update contact page")
    public void navigateToUpdatePage() {

        updatePage.clickUpdateContactInfo();
    }

    @And("user updates contact information")
    public void updateContactInformation() {

        updatePage.updateContactDetails();
    }

    @And("user clicks update profile button")
    public void clickUpdateButton() {

        updatePage.clickUpdateProfile();
    }

    @Then("contact information should update successfully")
    public void verifyUpdateSuccess() {

        Assert.assertTrue(
                updatePage.isUpdateSuccessful(),
                "Profile Update Failed");
    }
}