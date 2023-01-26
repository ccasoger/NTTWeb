package com.nttdata.ct.web.page;

import com.nttdata.ct.web.base.WebBase;
import org.apache.xmlbeans.impl.xb.xsdschema.SelectorDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SauceLoginPage extends WebBase {

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    protected WebElement labelName;

    @FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    protected WebElement addButton;

    @FindBy(xpath="//*[@id=\"item_4_img_link\"]/img")
    protected WebElement itemProduct;

    public String getLabelName() {
        return getText(labelName);
    }

    public void addCart() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addButton));
        click(addButton);
    }

    public void viewProduct() {
        var wait = webDriverWait(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(itemProduct));
        click(itemProduct);
    }
}
