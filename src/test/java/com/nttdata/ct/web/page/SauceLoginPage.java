package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLoginPage extends WebBase {

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    protected WebElement labelName;

    public String getLabelName() {
        return getText(labelName);
    }
}
