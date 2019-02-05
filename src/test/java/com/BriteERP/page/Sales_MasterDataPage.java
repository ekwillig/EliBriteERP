package com.BriteERP.page;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Sales_MasterDataPage extends MenuPage {

    public Sales_MasterDataPage()
    { PageFactory.initElements(Driver.getDriver(), this); }


@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[1]/li[2]/a/spanl")
    public WebElement MasterData;



}

