package com.solvd.carina.demo.saucedemowentest.mobile;

import com.solvd.carina.demo.gui.saucedemo.mobile.android.Header;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.CartScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.HeaderBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.LoginScreenBase;
import com.solvd.carina.demo.gui.saucedemo.mobile.common.ProductsScreenBase;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends AbstractTest {

    @Test
    public void addTwoItemsToCartTest() {
        String firstProduct = "Sauce Labs Backpack";
        String secondProduct = "Sauce Labs Bike Light";

        LoginScreenBase loginScreen = initPage(LoginScreenBase.class);
        Assert.assertTrue(loginScreen.isOpened(), "Login screen is not opened");
        loginScreen.typeUserName(R.TESTDATA.get("standard_user_username"));
        loginScreen.typePassword(R.TESTDATA.get("default_user_password"));
        ProductsScreenBase productScreen = loginScreen.clickLoginButton();
        Assert.assertTrue(productScreen.isOpened(), "products screen is not opened");
        productScreen.addProductToCart(firstProduct);
        productScreen.addProductToCart(secondProduct);
        HeaderBase header = new Header(getDriver());
        CartScreenBase cartScreen = header.clickCartButton();
        Assert.assertTrue(cartScreen.isOpened(), "Cart screen is not opened");
        cartScreen.isProductPresent(firstProduct);
        cartScreen.isProductPresent(secondProduct);
    }
}
