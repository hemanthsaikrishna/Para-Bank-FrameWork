package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import pages.BillPaymentPage;

import base.DriverFactory;

public class BillPaymentSteps {

    BillPaymentPage billPage =
            new BillPaymentPage(
                    DriverFactory.getDriver());



    @And("user navigates to bill payment page")
    public void navigateToBillPaymentPage() {

        billPage.clickBillPay();
    }



    @And("user enters bill payment details")
    public void enterBillDetails() {

        billPage.enterBillPaymentDetails();
    }



    @And("user clicks send payment button")
    public void clickSendPaymentButton() {

        billPage.clickSendPayment();
    }



    @Then("bill payment should complete successfully")
    public void verifyBillPayment() {

        Assert.assertTrue(

                billPage.isPaymentSuccessful(),

                "Bill Payment Failed"
        );
    }
}