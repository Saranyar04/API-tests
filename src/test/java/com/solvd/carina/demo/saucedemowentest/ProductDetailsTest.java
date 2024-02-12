package com.solvd.carina.demo.saucedemowentest;

import com.solvd.carina.demo.gui.saucedemo.components.InventoryItem;
import com.solvd.carina.demo.gui.saucedemo.pages.LoginPage;
import com.solvd.carina.demo.gui.saucedemo.pages.ProductDetailsPage;
import com.solvd.carina.demo.gui.saucedemo.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class ProductDetailsTest extends AbstractSauceDemoTest {

    @Test
    public void viewProductDetailsTest() {
        String productTitle = "Sauce Labs Backpack";

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();

        ProductPage productPage = authUtil.loginStandardUser();
        Assert.assertTrue(productPage.isPageOpened(), "Product page is not opened after login");
        List<InventoryItem> inventoryItemList = productPage.getProducts();
        for (InventoryItem inventoryItem : inventoryItemList) {
            if (productTitle.equals(inventoryItem.getProductTitle())) {
                inventoryItem.clickProductName();
                break;
            }
        }
        ProductDetailsPage productDetailsPage = productPage.clickProductName();
        Assert.assertTrue(productDetailsPage.isPageOpened(), "Product Details page is not opened");
        Assert.assertTrue(productDetailsPage.isProductPresent(productTitle), "Product :" + productTitle + "is not present in cart");
        Assert.assertNotNull(productDetailsPage.getDescriptionText() , "Product description not present");
        Assert.assertTrue(productDetailsPage.getPriceText().matches("^\\$(([1-9]\\d{0,2}(,\\d{3})*)|(([1-9]\\d*)?\\d))(\\.\\d\\d)?$"), "Product price not present");
        Assert.assertTrue(productDetailsPage.isAddToCartButtonPresent(), "Add to Cart Button not present");
        Assert.assertTrue(productDetailsPage.isInventoryImagePresent(), "Product Image is not present");
    }

}