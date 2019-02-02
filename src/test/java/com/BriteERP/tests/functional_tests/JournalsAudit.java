package com.BriteERP.tests.functional_tests;

import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.TestBase;
import org.testng.annotations.Test;

public class JournalsAudit extends TestBase {

    @Test
    public void defaultValues(){
        pages.login().login(ConfigurationReader.getProperty("email"),
                ConfigurationReader.getProperty("password"));

//        Select "Invoicing" from the available Main Menu options
//        Click on "PDF Reports" on the left menu column
//        Select "Journals Audit" from drop down list on sub-menu
//        Verify the default value for Target Moves is "All Posted Entries"
//        Verify the default value for Entries Sorted by is "Journal Entry Number"
//        Verify the default values for Journals are "Customer InvoicesUSD)", "VendorBills(USD)", "POS Sale Journal(USD)"
//        Verify the user able to add more options from Journals drop down
//        Verify the user able to remove journal from the list by clicking on "x" icon
//        Verify that user able to click "Print" button on left bottom corner
//        Verify that user is able to navigate to logout button and click log out successfully

    }

}
