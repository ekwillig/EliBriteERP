package com.BriteERP.page;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasesPage extends MenuPage {

    public PurchasesPage(){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//div[@class='o_list_buttons']/button")
    public WebElement createVendorBills;

  //  @FindBy(xpath = "(//div[@class='o_input_dropdown']/span)[1]")
    @FindBy(xpath = "(//div[@class='o_group']/table/tbody/tr/td/div/div/input)[1]")
    public WebElement vendorDropDown;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li[9]/a")
    public WebElement vendorCreateAndEdit;

    @FindBy(xpath = "//div[@class='modal-header']/h4")
    public WebElement createVendor;

    @FindBy(xpath = "//div[@class='o_radio_item'][1]/input")
    public WebElement individualRadioButton;

    @FindBy(xpath = "//div[@class='o_not_full oe_button_box']/button[1]")
    public WebElement meetingsButtonHeader;

    @FindBy(xpath = "//div[@class='o_not_full oe_button_box']/button[2]")
    public WebElement onWebsiteButtonHeader;

    @FindBy(xpath = "//div[@class='o_not_full oe_button_box']/button[3]")
    public WebElement vendorBillsButtonHeader;

    @FindBy(xpath = "//div[@class='o_not_full oe_button_box']/button[4]")
    public WebElement activeButtonHeader;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_address_street'][1]")
    public WebElement addressStreet;



}
