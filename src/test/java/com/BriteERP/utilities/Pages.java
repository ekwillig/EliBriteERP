package com.BriteERP.utilities;

import com.BriteERP.page.LoginPage;

public class Pages {

    private LoginPage loginPage;


    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
}
