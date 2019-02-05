package com.BriteERP.page;

import com.BriteERP.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ConfigurationPage extends MenuPage {
    public ConfigurationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
