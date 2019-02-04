package com.BriteERP.page;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class MenuTabsPage extends MenuPage{

    public MenuTabsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
