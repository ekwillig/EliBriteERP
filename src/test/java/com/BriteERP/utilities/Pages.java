package com.BriteERP.utilities;

import com.BriteERP.page.LoginPage;
import com.BriteERP.page.MenuPage;
import com.BriteERP.page.PurchasesPage;

public class Pages {

    private LoginPage loginPage;
    private PurchasesPage purchasesPage;


    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public PurchasesPage purchases() {
        if (purchasesPage == null) {
            purchasesPage = new PurchasesPage();
        }
        return purchasesPage;
    }
}