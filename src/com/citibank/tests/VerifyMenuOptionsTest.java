package com.citibank.tests;

import com.citibank.pages.HomePage;
import com.citibank.pages.LoginPage;
import com.citibank.pages.MenuPage;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by Srikanth on 11/27/14.
 */
public class VerifyMenuOptionsTest extends AbstractTest{

    @Category(RegressionTests.class)
    @Test
    public void testVerifyMenuOptions(){
        LoginPage lp=tc.clickAcceptButton().clickSignOnButton();
        lp.setUserName("jpt31_7213");
        lp.setPassword("ist123");
        HomePage hp=lp.clickLoginButton().clickCloseTutorialButton();
        Assert.assertTrue(hp.verifyMenuIcon());
        MenuPage mp=hp.clickMenuIcon();
        mp.verifyMenuOptions();
    }
}
