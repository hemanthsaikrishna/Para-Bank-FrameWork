package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPaymentPage {

    WebDriver driver;

    // Constructor
    public BillPaymentPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators
    By billPayLink =
            By.linkText("Bill Pay");

    By payeeName =
            By.name("payee.name");

    By address =
            By.name("payee.address.street");

    By city =
            By.name("payee.address.city");

    By state =
            By.name("payee.address.state");

    By zipCode =
            By.name("payee.address.zipCode");

    By phone =
            By.name("payee.phoneNumber");

    By accountNumber =
            By.name("payee.accountNumber");

    By verifyAccount =
            By.name("verifyAccount");

    By amount =
            By.name("amount");

    By sendPaymentButton =
            By.xpath("//input[@value='Send Payment']");

    By successMessage =
            By.xpath(
            "//*[contains(text(),'Bill Payment Complete') or contains(text(),'has been paid')]");

    // Actions
    public void clickBillPay() {

        driver.findElement(billPayLink)
                .click();
    }

    public void enterBillPaymentDetails() {

        driver.findElement(payeeName)
                .sendKeys("John");

        driver.findElement(address)
                .sendKeys("New York");

        driver.findElement(city)
                .sendKeys("NYC");

        driver.findElement(state)
                .sendKeys("NY");

        driver.findElement(zipCode)
                .sendKeys("10001");

        driver.findElement(phone)
                .sendKeys("9999999999");

        driver.findElement(accountNumber)
                .sendKeys("12345");

        driver.findElement(verifyAccount)
                .sendKeys("12345");

        driver.findElement(amount)
                .sendKeys("100");
    }

    public void clickSendPayment() {

        driver.findElement(sendPaymentButton)
                .click();
    }

    public boolean isPaymentSuccessful() {

        try {

            String pageSource =
                    driver.getPageSource();

            System.out.println(
                    "Bill Payment Page Loaded");

            return pageSource.contains(
                    "Bill Payment Complete")
                    ||
                    pageSource.contains(
                    "has been paid");

        } catch (Exception e) {

            return false;
        }
    }
}