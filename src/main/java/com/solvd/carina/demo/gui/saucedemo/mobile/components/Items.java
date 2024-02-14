package com.solvd.carina.demo.gui.saucedemo.mobile.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Items extends AbstractPage {

    @FindBy(xpath = ".//android.widget.TextView[@text='%s']")
    private ExtendedWebElement productTitleS;

    @FindBy(xpath = ".//android.widget.TextView[@text='%s']/following-sibling::*[@content-desc='test-ADD TO CART']")
    private ExtendedWebElement addToCartButtonS;

    public Items(WebDriver driver) {
        super(driver);
    }


    public void clickAddToCardButton(String productName) {
        addToCartButtonS.format(productName).click();
    }

    //public String getProductTitle() {
    //    return productTitle.getText();
    //}

}
