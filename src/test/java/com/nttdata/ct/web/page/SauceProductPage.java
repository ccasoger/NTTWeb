package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SauceProductPage extends WebBase{

    @FindBy (xpath = "//*[@id=\"back-to-products\"]")
    protected WebElement backProducts;


    public String getLabelName2() {
        return getText(backProducts);
    }
}
