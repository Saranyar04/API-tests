package com.solvd.carina.demo.saucedemowentest;

import com.solvd.carina.demo.gui.saucedemo.web.components.InventoryItem;
import com.solvd.carina.demo.gui.saucedemo.web.CartPage;
import com.solvd.carina.demo.gui.saucedemo.web.LoginPage;
import com.solvd.carina.demo.gui.saucedemo.web.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveProductFromCartTest extends AbstractSauceDemoTest {

    @Test
    public void removeProduct() {
        String firstProduct = "Sauce Labs Backpack";
        String secondProduct = "Sauce Labs Bike Light";

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        ProductsPage productsPage = authUtil.loginStandardUser();
        Assert.assertTrue(productsPage.isPageOpened(), "Product page is not opened after login");
        productsPage.addProductToCart(firstProduct);
        productsPage.addProductToCart(secondProduct);
        productsPage.removeProductFromCart(firstProduct);
        CartPage cartPage = productsPage.clickCartButton();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart Page is not opened");
        Assert.assertFalse(cartPage.isProductPresent(firstProduct), "Product : " + firstProduct + "is present in the cart");
        Assert.assertTrue(cartPage.isProductPresent(secondProduct), "Product : " + secondProduct + "is not present in the cart");
    }

}