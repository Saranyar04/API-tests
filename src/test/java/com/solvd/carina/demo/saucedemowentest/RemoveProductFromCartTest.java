package com.solvd.carina.demo.saucedemowentest;

import com.solvd.carina.demo.gui.saucedemo.components.InventoryItem;
import com.solvd.carina.demo.gui.saucedemo.pages.CartPage;
import com.solvd.carina.demo.gui.saucedemo.pages.LoginPage;
import com.solvd.carina.demo.gui.saucedemo.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RemoveProductFromCartTest extends AbstractSauceDemoTest {

    @Test
    public void removeProduct() {
        String firstProduct = "Sauce Labs Backpack";
        String secondProduct = "Sauce Labs Bike Light";

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        ProductPage productPage = authUtil.loginStandardUser();
        Assert.assertTrue(productPage.isPageOpened(), "Product page is not opened after login");
        List<InventoryItem> inventoryItemList = productPage.getProducts();
        for (InventoryItem inventoryItem : inventoryItemList) {
            if (firstProduct.equals(inventoryItem.getProductTitle()) || secondProduct.equals(inventoryItem.getProductTitle( ))) {
                inventoryItem.clickAddToCardButton();
            }
        }
        for (InventoryItem inventoryItem : inventoryItemList) {
            if (firstProduct.equals(inventoryItem.getProductTitle())) {
                inventoryItem.clickRemoveButton();
            }
        }
        CartPage cartPage = productPage.clickCartButton();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart Page is not opened");
        Assert.assertFalse(cartPage.isProductPresent(firstProduct), "Product : " + firstProduct + "is present in the cart");
        Assert.assertTrue(cartPage.isProductPresent(secondProduct), "Product : " + secondProduct + "is not present in the cart");
    }

}