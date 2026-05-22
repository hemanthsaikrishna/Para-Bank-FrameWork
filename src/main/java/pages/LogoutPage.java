package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {

        this.driver = driver;
    }

    // LOCATORS

    By logoutLink =
            By.linkText("Log Out");

    By loginButton =
            By.xpath("//input[@value='Log In']");



    // METHODS

    public void clickLogout() {

        driver.findElement(logoutLink)
                .click();
    }

    public boolean isLoginButtonDisplayed() {

        try {

            return driver.findElement(loginButton)
                    .isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }
}