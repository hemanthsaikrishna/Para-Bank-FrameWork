package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundsPage {

    WebDriver driver;

    public TransferFundsPage(WebDriver driver) {

        this.driver = driver;
    }

    // LOCATORS

    By transferFundsLink =
            By.linkText("Transfer Funds");

    By amountTextbox =
            By.id("amount");

    By fromAccountDropdown =
            By.id("fromAccountId");

    By toAccountDropdown =
            By.id("toAccountId");

    By transferButton =
            By.xpath("//input[@value='Transfer']");

    By successMessage =
            By.xpath("//*[contains(text(),'Transfer Complete')]");



    // METHODS

    public void clickTransferFundsLink() {

        driver.findElement(transferFundsLink)
                .click();
    }

    public void enterAmount(String amount) {

        driver.findElement(amountTextbox)
                .clear();

        driver.findElement(amountTextbox)
                .sendKeys(amount);
    }

    public void clickTransferButton() {

        driver.findElement(transferButton)
                .click();
    }

    public String getSuccessMessage() {

        try {

            return driver.findElement(successMessage)
                    .getText();

        } catch (Exception e) {

            return "";
        }
    }

    public String getCurrentUrl() {

        return driver.getCurrentUrl();
    }
}