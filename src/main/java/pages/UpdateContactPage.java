package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateContactPage {

    WebDriver driver;

    public UpdateContactPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators
    By updateContactLink =
            By.linkText("Update Contact Info");

    By firstName =
            By.id("customer.firstName");

    By lastName =
            By.id("customer.lastName");

    By address =
            By.id("customer.address.street");

    By city =
            By.id("customer.address.city");

    By state =
            By.id("customer.address.state");

    By zipCode =
            By.id("customer.address.zipCode");

    By phone =
            By.id("customer.phoneNumber");

    By updateButton =
            By.xpath("//input[@value='Update Profile']");

    // Actions
    public void clickUpdateContactInfo() {

        driver.findElement(updateContactLink)
                .click();
    }

    public void updateContactDetails() {

        driver.findElement(firstName)
                .clear();

        driver.findElement(firstName)
                .sendKeys("John");

        driver.findElement(lastName)
                .clear();

        driver.findElement(lastName)
                .sendKeys("Doe");

        driver.findElement(address)
                .clear();

        driver.findElement(address)
                .sendKeys("New York");

        driver.findElement(city)
                .clear();

        driver.findElement(city)
                .sendKeys("NYC");

        driver.findElement(state)
                .clear();

        driver.findElement(state)
                .sendKeys("NY");

        driver.findElement(zipCode)
                .clear();

        driver.findElement(zipCode)
                .sendKeys("10001");

        driver.findElement(phone)
                .clear();

        driver.findElement(phone)
                .sendKeys("9999999999");
    }

    public void clickUpdateProfile() {

        driver.findElement(updateButton)
                .click();
    }

    public boolean isUpdateSuccessful() {

        return driver.getPageSource()
                .contains("Profile Updated");
    }
}
