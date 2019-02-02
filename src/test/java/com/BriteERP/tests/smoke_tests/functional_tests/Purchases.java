package com.BriteERP.tests.smoke_tests.functional_tests;

import com.BriteERP.page.LoginPage;
import com.BriteERP.page.MenuPage;
import com.BriteERP.tests.smoke_tests.Login_Test;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.TestBase;
import org.testng.annotations.Test;

public class Purchases extends TestBase {


    @Test
    //extentLogger = report.createTest("TC1 Purchases");
    public void Purchases(){
        pages.login().login(ConfigurationReader.getProperty("email"),ConfigurationReader.getProperty("password"));
        pages.purchases().invoicing.click();
        pages.purchases().documentsUnderPurchases.click();





    }

}
