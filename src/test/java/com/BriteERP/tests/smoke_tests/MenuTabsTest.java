package com.BriteERP.tests.smoke_tests;

import com.BriteERP.utilities.ApplicationConstants;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MenuTabsTest extends TestBase {

    @Test
    public void menuTabs() throws InterruptedException {
        extentLogger = report.createTest("Smoke test");

        pages.login().login(ConfigurationReader.getProperty("email"),
                ConfigurationReader.getProperty("password"));

        sleep(4000);

        extentLogger.info("Verify Invoicing option is available on top menu bar");
        assertTrue(pages.purchases().invoicing.isEnabled());
        assertTrue(pages.purchases().invoicing.isDisplayed());
        pages.purchases().invoicing.click();

        extentLogger.info("Verify Sales option is displayed");
        sleep(4000);
        String sales = driver.findElement(By.xpath("//div[@class='o_sub_menu_content']/div[8]/div[1]")).getText();
        assertEquals(sales, "Sales");

        extentLogger.info("Verify Sales category contains Documents and Master Data");
        assertTrue(pages.menu().documentsUnderSales.isDisplayed());
        assertTrue(pages.menu().masterData1.isDisplayed());


        extentLogger.info("Verify Purchases option is displayed");
        sleep(4000);
        String purchases = driver.findElement(By.xpath("//div[@class='o_sub_menu_content']/div[8]/div[2]")).getText();
        assertEquals(purchases, "Purchases");

        extentLogger.info("Verify Purchases category contains Documents and Master Data");
        assertTrue(pages.menu().documentsUnderPurchases.isDisplayed());
        assertTrue(pages.menu().masterData2.isDisplayed());

        extentLogger.info("Verify Reporting option is displayed");
        sleep(4000);
        String reporting = driver.findElement(By.xpath("//div[@class='o_sub_menu_content']/div[8]/div[3]")).getText();
        assertEquals(reporting, "Reporting");

        extentLogger.info("Verify Reporting category contains Management and PDF reports");
        assertTrue(pages.menu().managementUnderReporting.isDisplayed());
        assertTrue(pages.menu().pdfReports.isDisplayed());


        extentLogger.info("Verify Configuration option is displayed");
        sleep(4000);
        String config = driver.findElement(By.xpath("//div[@class='o_sub_menu_content']/div[8]/div[4]")).getText();
        assertEquals(config, "Configuration");

        extentLogger.info("Verify Configuration category contains Accounting, Management and Payments");
        assertTrue(pages.menu().accountingConfiguration.isDisplayed());
        assertTrue(pages.menu().managementConfiguration.isDisplayed());
        assertTrue(pages.menu().paymentsConfiguration.isDisplayed());

        extentLogger.info("Verify user can log out");
        pages.menu().nameOnHeader.click();
        pages.menu().logout.click();

        extentLogger.pass("Passed: Smoke test");


    }
}
