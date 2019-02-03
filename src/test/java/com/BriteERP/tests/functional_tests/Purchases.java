package com.BriteERP.tests.functional_tests;

import com.BriteERP.page.LoginPage;
import com.BriteERP.page.MenuPage;
import com.BriteERP.tests.smoke_tests.Login_Test;
import com.BriteERP.utilities.ApplicationConstants;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.TestBase;
import org.testng.annotations.Test;

import static java.lang.Thread.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Purchases extends TestBase {


    @Test

    public void Purchases() throws InterruptedException {
        extentLogger = report.createTest("Purchases test");

        pages.login().login(ConfigurationReader.getProperty("email"),ConfigurationReader.getProperty("password"));
        sleep(4000);
        pages.purchases().invoicing.click();
        sleep(4000);
        pages.purchases().documentsUnderPurchases.click();

        sleep(4000);
        pages.purchases().vendorBillsUnderPurchases.click();
        sleep(5000);
        String str = driver.getTitle();
        System.out.println(str);

        extentLogger.info("Verifying Vendor bills page opened");
        assertEquals(driver.getTitle(), ApplicationConstants.VENDOR_BILLS);


        extentLogger = report.createTest("New vendor page validation test");
        pages.purchases().createVendorBills.click();
        sleep(3000);
        pages.purchases().vendorDropDown.click();
        sleep(3000);
        pages.purchases().vendorCreateAndEdit.click();

        extentLogger.info("Verifying Create: Vendor page is displayed");
        assertTrue(pages.purchases().createVendor.isDisplayed());

        extentLogger.info("Verifying Individual radio button is selected by default");
        assertTrue(pages.purchases().individualRadioButton.isSelected());

        extentLogger.info("Verifying Mettings button displayed on header");
        assertTrue(pages.purchases().meetingsButtonHeader.isDisplayed());

        extentLogger.info("Verifying On Website button displayed on header");
        assertTrue(pages.purchases().onWebsiteButtonHeader.isDisplayed());

        extentLogger.info("Verifying Vendor bills button displayed on header");
        assertTrue(pages.purchases().vendorBillsButtonHeader.isDisplayed());

        extentLogger.info("Verifying Active button displayed on header");
        assertTrue(pages.purchases().activeButtonHeader.isDisplayed());

        extentLogger.info("Verifying address field");
        sleep(3000);
        assertEquals(pages.purchases().addressStreet.getAttribute("placeholder"), "Street...");
        sleep(3000);

        extentLogger.pass("Passed: Vendor bills navigation test");

    }

}
