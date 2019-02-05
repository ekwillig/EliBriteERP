package com.BriteERP.tests.functional_tests;

import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.TestBase;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class MasterData extends TestBase {

    @Test

    public void Customer() throws InterruptedException {
        extentLogger = report.createTest("");

        pages.login().login(ConfigurationReader.getProperty("email"), ConfigurationReader.getProperty("password"));
        sleep(4000);
        pages.purchases().invoicing.click();
        sleep(4000);
    }
}