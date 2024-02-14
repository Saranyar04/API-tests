package com.solvd.carina.demo.saucedemowentest;

import com.solvd.carina.demo.gui.saucedemo.web.*;
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
        ProductsPage productsPage = authUtil.loginStandardUser();
        Assert.assertTrue(productsPage.isPageOpened(), "Product page is not opened after login");
        productsPage.addProductToCart(firstProduct);
        productsPage.addProductToCart(secondProduct);
        CartPage cartPage = productsPage.clickCartButton();
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
        ProductsPage productsPage = authUtil.loginStandardUser();
        Assert.assertTrue(productsPage.isPageOpened(), "Product page is not opened after login");
        productsPage.addProductToCart(firstProduct);
        productsPage.addProductToCart(secondProduct);
        CartPage cartPage = productsPage.clickCartButton();
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