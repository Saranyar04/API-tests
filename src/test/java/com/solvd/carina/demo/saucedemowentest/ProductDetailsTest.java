package com.solvd.carina.demo.saucedemowentest;

import com.solvd.carina.demo.gui.saucedemo.web.LoginPage;
import com.solvd.carina.demo.gui.saucedemo.web.ProductDetailsPage;
import com.solvd.carina.demo.gui.saucedemo.web.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ProductDetailsTest extends AbstractSauceDemoTest {

    @Test
    public void viewProductDetailsTest() {
        String productTitle = "Sauce Labs Backpack";

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();

        ProductsPage productsPage = authUtil.loginStandardUser();
        Assert.assertTrue(productsPage.isPageOpened(), "Product page is not opened after login");
        ProductDetailsPage productDetailsPage =  productsPage.clickProductName(productTitle);
        Assert.assertTrue(productDetailsPage.isPageOpened(), "Product Details page is not opened");
        Assert.assertTrue(productDetailsPage.isProductPresent(productTitle), "Product :" + productTitle + "is not present in cart");
        Assert.assertNotNull(productDetailsPage.getDescriptionText() , "Product description not present");
        Assert.assertTrue(productDetailsPage.getPriceText().matches("^\\$(([1-9]\\d{0,2}(,\\d{3})*)|(([1-9]\\d*)?\\d))(\\.\\d\\d)?$"), "Product price not present");
        Assert.assertTrue(productDetailsPage.isAddToCartButtonPresent(), "Add to Cart Button not present");
        Assert.assertTrue(productDetailsPage.isInventoryImagePresent(), "Product Image is not present");
    }

}