package pages;

import browser.Browser;
import browser.Info;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    @FindBy(css = "input[name='username']") private WebElement username;
    @FindBy(xpath = "//input[@name='password']") private WebElement password;
    @FindBy(className = "orangehrm-login-button") private WebElement logInButton;

    public PIMPage logToPIMPage() {
        username.sendKeys(Info.USERNAME);
        password.sendKeys(Info.PASSWORD);
        logInButton.click();

        return PageFactory.initElements(Browser.driver, PIMPage.class);
    }
}
