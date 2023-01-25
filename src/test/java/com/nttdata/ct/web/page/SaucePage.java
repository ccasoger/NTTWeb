package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SaucePage extends WebBase{

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    protected WebElement userName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    protected WebElement pass;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    protected WebElement loginButton;

    public void writeUser(String data) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(userName));
        type(userName, data);
    }

    public void writePass(String data) {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pass));
        type(pass, data);
    }

    public void login() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        click(loginButton);
    }
}
