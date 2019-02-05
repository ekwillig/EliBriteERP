package com.BriteERP.tests.functional_tests.configurationTab;

import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Thread.sleep;

public class BankAccountPageFunctionality extends TestBase {
    @Test
    public void pageFunctionalityTesting() throws InterruptedException {

        pages.login().login(ConfigurationReader.getProperty("email"),
                ConfigurationReader.getProperty("password"));
        sleep(3000);
        pages.config().invoicing.click();
        sleep(2000);

        pages.config().accountingConfiguration.click();
        sleep(2000);

        pages.config().bankAccounts.click();
        String createActual = driver.findElement(By.xpath("//*[@class='btn btn-primary btn-sm o_list_button_add']")).getText();
        String createExpected = "Create";
        Assert.assertEquals(createActual, createExpected);
        String importActual = driver.findElement(By.xpath("//*[@class='btn btn-sm btn-default o_button_import']")).getText();
        Assert.assertEquals(importActual, "Import");


        sleep(3000);

        List<WebElement> allRows = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr/td[3]"));

        sleep(2000);
        List<String> journalNames = new ArrayList<>();
        for (int i = 1; i <= allRows.size(); i++) {
            journalNames.add(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[" + i + "]/td[3]")).getText());

        }
        System.out.println(journalNames);
        Collections.sort(journalNames);
        System.out.println(journalNames);

        sleep(3000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[3]")).click();

        sleep(3000);
        List<WebElement> sortedJournalNames = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr/td[3]"));
        List<String> sorted = new ArrayList<>();
        for (int j = 1; j <= sortedJournalNames.size(); j++) {
            sorted.add(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[" + j + "]/td[3]")).getText());

        }
        System.out.println(sorted);
        Assert.assertEquals(journalNames, sorted);

        WebElement anyRow = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[3]/td[1]/div/input"));
        anyRow.click();

        WebElement actionButton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button"));
        actionButton.isDisplayed();
        actionButton.click();

        WebElement delete = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li[4]/a"));
        delete.click();
        sleep(2000);

        //Thread.sleep(2000);
        //driver.findElement(By.cssSelector("#modal_106 > div > div > div.modal-footer > button.btn.btn-sm.btn-primary")).click();
        //WebElement beforeDelete = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/tr[3]/td[3]"));
        //WebElement deletedRow = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/tr[3]/td[3]"));

        //Assert.assertNotSame(beforeDelete.getText(), deletedRow.getText());


    }
}
