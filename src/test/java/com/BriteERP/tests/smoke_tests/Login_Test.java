package com.BriteERP.tests.smoke_tests;

import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.TestBase;
import org.testng.annotations.Test;

public class Login_Test extends TestBase {

    @Test
    public void loginAsManag(){
        pages.login().login(ConfigurationReader.getProperty("email"),
                ConfigurationReader.getProperty("password"));
    }
    @Test
    public void loginAsUser(){
        pages.login().login(ConfigurationReader.getProperty("userEmail"),
                ConfigurationReader.getProperty("userPassword"));
    }


}
