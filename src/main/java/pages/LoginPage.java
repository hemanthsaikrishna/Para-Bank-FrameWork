package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username =
            By.name("username");

    By password =
            By.name("password");

    By loginBtn =
            By.xpath("//input[@value='Log In']");

    By errorMsg =
            By.xpath("//p[@class='error']");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void enterUsername(String uname) {

        driver.findElement(username)
                .clear();

        driver.findElement(username)
                .sendKeys(uname);
    }

    public void enterPassword(String pwd) {

        driver.findElement(password)
                .clear();

        driver.findElement(password)
                .sendKeys(pwd);
    }

    public void clickLogin() {

        driver.findElement(loginBtn).click();
    }

    public String getErrorMessage() {

        return driver.findElement(errorMsg)
                .getText();
    }
}
