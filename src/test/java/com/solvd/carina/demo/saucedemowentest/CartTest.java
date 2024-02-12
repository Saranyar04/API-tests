package com.solvd.carina.demo.saucedemowentest;

import com.solvd.carina.demo.gui.saucedemo.components.InventoryItem;
import com.solvd.carina.demo.gui.saucedemo.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CartTest extends AbstractSauceDemoTest {

    @Test
    public void addProductToCartTest() {
        String firstProduct = "Sauce Labs Backpack";
        String secondProduct = "Sauce Labs Bike Light";

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        ProductPage productPage = authUtil.loginStandardUser();
        Assert.assertTrue(productPage.isPageOpened(), "Product page is not opened after login");
        productPage.addProductToCart(firstProduct);
        productPage.addProductToCart(secondProduct);
        CartPage cartPage = productPage.clickCartButton();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart Page is not opened");
        Assert.assertTrue(cartPage.isProductPresent(firstProduct), "Product : " + firstProduct + "is not present in the cart");
        Assert.assertTrue(cartPage.isProductPresent(secondProduct), "Product : " + secondProduct + "is not present in the cart");
    }

    @Test
    public void checkoutScreenTest() {
        String firstProduct = "Sauce Labs Backpack";
        String secondProduct = "Sauce Labs Bike Light";
        String firstName = "Sam";
        String lastName = "Tam";
        String postalCode = "01001";

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        ProductPage productPage = authUtil.loginStandardUser();
        Assert.assertTrue(productPage.isPageOpened(), "Product page is not opened after login");
        List<InventoryItem> inventoryItemList = productPage.getProducts();
        for (InventoryItem inventoryItem : inventoryItemList) {
            if (firstProduct.equals(inventoryItem.getProductTitle()) || secondProduct.equals(inventoryItem.getProductTitle())) {
                inventoryItem.clickAddToCardButton();
            }
        }
        CartPage cartPage = productPage.clickCartButton();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart Page is not opened");
        Assert.assertTrue(cartPage.isProductPresent(firstProduct), "Product : " + firstProduct + "is not present in the cart");
        Assert.assertTrue(cartPage.isProductPresent(secondProduct), "Product : " + secondProduct + "is not present in the cart");
        CheckoutInfoPage checkoutInfoPage = cartPage.clickCheckoutButton();
        checkoutInfoPage.typeFirstName(firstName);
        checkoutInfoPage.typeLastName(lastName);
        checkoutInfoPage.typePostalCode(postalCode);
        CheckoutOverviewPage checkoutOverviewPage = checkoutInfoPage.clickContinueButton();
        Assert.assertTrue(checkoutOverviewPage.isPageOpened());
        Assert.assertTrue(checkoutOverviewPage.isProductPresent(firstProduct), "Product : " + firstProduct + "is not present in the cart");
        Assert.assertTrue(checkoutOverviewPage.isProductPresent(secondProduct), "Product : " + secondProduct + "is not present in the cart");
    }


}
