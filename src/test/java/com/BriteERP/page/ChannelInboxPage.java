package com.BriteERP.page;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChannelInboxPage {
    public ChannelInboxPage(){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(linkText = "Invoicing")
    public WebElement invoicingLink;


    @FindBy(xpath = "//li[.=\"#Inbox\"]")
    public WebElement hasTagInbox;

    public void navigateToInvoicing(){
        invoicingLink.click();
    }
}
