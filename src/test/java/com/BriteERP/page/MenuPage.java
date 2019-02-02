package com.BriteERP.page;


import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class MenuPage{


        public MenuPage() { PageFactory.initElements(Driver.getDriver(),this); }

        @FindBy(linkText = "Invoicing")
        public WebElement invoicing;


        @FindBy(xpath = "//a[@data-menu='201']")
        public WebElement documentsUnderSales;

        @FindBy(xpath="//a[@data-menu='239']")
        public WebElement customerInvoices;


        @FindBy(xpath="//a[@data-menu='240'")
        public WebElement customerCreditNotes;

        @FindBy(xpath="//a[@data-menu='223']")
        public WebElement paymentsUnderDocuments;

        @FindBy(xpath="//a[@data-menu='203']")
        public WebElement masterData1;

        @FindBy(xpath="//a[@data-action-id='49']")
        public WebElement customers;

        @FindBy(xpath="//a[@data-action-id='295']")
        public WebElement sellableProducts;



        @FindBy(xpath="//a[@data-menu='205']")
        public WebElement documentsUnderPurchases;

        @FindBy(xpath="//a[@data-menu='241']")
        public WebElement vendorBillsUnderPurchases;

        @FindBy(xpath="//a[@data-menu='242']")
        public WebElement vendorCreditNotes;

        @FindBy(xpath="//a[@data-menu='224']")
        public WebElement paymentsUnderPurchases;

        @FindBy(xpath="//a[@data-menu='206']")
        public  WebElement masterData2;

        @FindBy(xpath="//a[@data-menu='236']")
        public WebElement vendorsUnderMasterData;

        @FindBy(xpath="//a[@data-menu='235']")
        public WebElement purchasableProducts;

        @FindBy(xpath = "//a[@data-menu='213']")
        public WebElement managementUnderReporting;


        @FindBy(xpath="//a[@data-menu='216']")
        public WebElement pdfReports;

        @FindBy(xpath="//a[@data-menu='218']")
        public WebElement accountingConfiguration;

        @FindBy(xpath="//a[@data-menu='229']")
        public WebElement taxesAccounting;

        @FindBy(xpath="//a[@data-menu='243']")
        public WebElement fiscalPosition;

        @FindBy(xpath="//a[@data-menu='226']")
        public WebElement bankAccounts;

        @FindBy(xpath="//a[@data-menu='227']")
        public WebElement journalsUnderAccounting;

        @FindBy(xpath="//a[@data-menu='219']")
        public WebElement managementConfiguration;

        @FindBy(xpath="//a[@data-menu='232']")
        public WebElement paymentTermsUnderManagement;

        @FindBy(xpath="//a[@data-menu='440']")
        public WebElement paymentsConfiguration;

        @FindBy(xpath="//a[@data-menu='441']")
        public WebElement paymentAcquirement;


    }

