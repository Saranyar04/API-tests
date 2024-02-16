package com.solvd.carina.demo.gui.saucedemo.mobile.components;

import com.solvd.carina.demo.gui.saucedemo.mobile.common.ItemBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Item extends ItemBase {

    @FindBy(xpath = ".//android.widget.TextView[@text='%s']")
    private ExtendedWebElement productTitleS;

    @FindBy(xpath = ".//android.widget.TextView[@text='%s']/following-sibling::*[@content-desc='test-ADD TO CART']")
    private ExtendedWebElement addToCartButtonS;

    public Item(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickAddToCartButton(String productName) {
        addToCartButtonS.format(productName).click();
    }

}
