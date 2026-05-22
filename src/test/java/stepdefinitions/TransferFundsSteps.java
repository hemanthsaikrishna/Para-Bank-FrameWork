package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.TransferFundsPage;
import pages.LoginPage;
import base.DriverFactory;

public class TransferFundsSteps {

    TransferFundsPage transferPage =
            new TransferFundsPage(
                    DriverFactory.getDriver());

    LoginPage loginPage =
            new LoginPage(
                    DriverFactory.getDriver());



    @And("user navigates to transfer funds page")
    public void navigateToTransferFundsPage() {

        transferPage.clickTransferFundsLink();
    }



    @And("user enters transfer amount")
    public void enterTransferAmount() {

        transferPage.enterAmount("100");
    }



    @And("clicks transfer button")
    public void clickTransferButton() {

        transferPage.clickTransferButton();
    }



    @Then("funds should transfer successfully")
    public void verifyTransferSuccess() {

        String currentUrl =
                transferPage.getCurrentUrl();

        String successMessage =
                transferPage.getSuccessMessage();

        System.out.println(
                "Current URL: " + currentUrl);

        System.out.println(
                "Success Message: " + successMessage);

        Assert.assertTrue(

                currentUrl.contains("transfer.htm"),

                "Transfer failed"
        );
    }
}