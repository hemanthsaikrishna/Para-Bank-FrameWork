package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {

        this.driver = driver;
    }

    By registerLink =
            By.linkText("Register");

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

    By ssn =
            By.id("customer.ssn");

    By username =
            By.id("customer.username");

    By password =
            By.id("customer.password");

    By confirmPassword =
            By.id("repeatedPassword");

    By registerBtn =
            By.xpath("//input[@value='Register']");

    By welcomeMessage =
            By.xpath("//h1[contains(text(),'Welcome')]");

    public void clickRegisterLink() {

        driver.findElement(registerLink)
                .click();
    }

    public void enterRegistrationDetails() {

        String dynamicUser =
                "para" + System.currentTimeMillis();

        System.out.println(
                "Generated Username: "
                + dynamicUser);

        driver.findElement(firstName)
                .sendKeys("John");

        driver.findElement(lastName)
                .sendKeys("Smith");

        driver.findElement(address)
                .sendKeys("Chennai");

        driver.findElement(city)
                .sendKeys("Chennai");

        driver.findElement(state)
                .sendKeys("Tamil Nadu");

        driver.findElement(zipCode)
                .sendKeys("600001");

        driver.findElement(phone)
                .sendKeys("9999999999");

        driver.findElement(ssn)
                .sendKeys("12345");

        driver.findElement(username)
                .sendKeys(dynamicUser);

        driver.findElement(password)
                .sendKeys("test123");

        driver.findElement(confirmPassword)
                .sendKeys("test123");
    }

    public void clickRegisterButton() {

        driver.findElement(registerBtn)
                .click();
    }

    public String getWelcomeMessage() {

        return driver.findElement(welcomeMessage)
                .getText();
    }
}