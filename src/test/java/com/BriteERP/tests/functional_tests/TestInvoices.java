package com.BriteERP.tests.functional_tests;

import com.BriteERP.page.ChannelInboxPage;
import com.BriteERP.page.InvoicingPage;
import com.BriteERP.page.LoginPage;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestInvoices extends TestBase {
    @Test
    public void testInvoicePageValidation(){

        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.login(ConfigurationReader.getProperty("userEmail"), ConfigurationReader.getProperty("userPassword"));

        ChannelInboxPage channelInboxPage = new ChannelInboxPage();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(channelInboxPage.hasTagInbox));
        channelInboxPage.navigateToInvoicing();

        InvoicingPage invoicingPage = new InvoicingPage();
        wait.until(ExpectedConditions.elementToBeClickable(invoicingPage.reportingManagementLink));
        invoicingPage.goToInvoices();


    }
}
