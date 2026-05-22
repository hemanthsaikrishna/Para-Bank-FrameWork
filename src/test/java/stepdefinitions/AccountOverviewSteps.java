package stepdefinitions;

import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Then;
import pages.AccountOverviewPage;

public class AccountOverviewSteps {

    AccountOverviewPage accountPage =
            new AccountOverviewPage(
                    DriverFactory.getDriver());

    @Then("account details should be displayed")
    public void verifyAccountDetails() {

        Assert.assertTrue(
                accountPage
                .isAccountTableDisplayed());

        int accountCount =
                accountPage.getAccountCount();

        System.out.println(
                "Accounts Found: "
                + accountCount);

        Assert.assertTrue(
                accountCount > 0);
    }
}