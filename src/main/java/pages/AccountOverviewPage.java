package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountOverviewPage {

    WebDriver driver;

    public AccountOverviewPage(WebDriver driver) {

        this.driver = driver;
    }

    By accountTable =
            By.id("accountTable");

    By accountNumbers =
            By.xpath("//table[@id='accountTable']//a");

    public boolean isAccountTableDisplayed() {

        return driver.findElement(accountTable)
                .isDisplayed();
    }

    public int getAccountCount() {

        List<WebElement> accounts =
                driver.findElements(accountNumbers);

        return accounts.size();
    }
}