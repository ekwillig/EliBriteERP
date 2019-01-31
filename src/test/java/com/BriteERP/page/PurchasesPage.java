package com.BriteERP.page;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasesPage extends MenuPage {

    public PurchasesPage(){ PageFactory.initElements(Driver.getDriver(), this); }


}
