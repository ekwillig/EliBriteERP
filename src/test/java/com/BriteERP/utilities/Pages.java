package com.BriteERP.utilities;

import com.BriteERP.page.*;

public class Pages {


    private LoginPage loginPage;
    private PurchasesPage purchasesPage;
    private MenuTabsPage menuTabsPage;
    private ConfigurationPage configurationPage;


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

        public MenuTabsPage menu() {
            if (menuTabsPage == null) {
                menuTabsPage = new MenuTabsPage();
            }
            return menuTabsPage;

    }

    public ConfigurationPage config() {
        if (configurationPage == null) {
            configurationPage = new ConfigurationPage();
        }
        return configurationPage;

    }

}