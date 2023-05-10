package step_definitions.PemilihTetap;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.PemilihTetapImportData;
import org.example.PageObject.PemilihTetapPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class ImportDataStepdefs {
    private WebDriver webDriver;
    public ImportDataStepdefs() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^user click dropdown tambah data$")
    public void userClickDropdownTambahData() throws InterruptedException {
        PemilihTetapImportData pemilihTetapImportData = new PemilihTetapImportData(webDriver);
        pemilihTetapImportData.setBtnDropDownTambah();
        Thread.sleep(2000);

    }

    @And("^user click import data$")
    public void userClickImportData() throws InterruptedException {
        PemilihTetapImportData pemilihTetapImportData = new PemilihTetapImportData(webDriver);
        pemilihTetapImportData.setDropdownImportData();
        Thread.sleep(2000);
    }

    @And("^user choose file excel with valid data$")
    public void userChooseFileExcelWithValidData() throws InterruptedException {
        PemilihTetapImportData pemilihTetapImportData = new PemilihTetapImportData(webDriver);
        pemilihTetapImportData.setChooseFileImport();
        Thread.sleep(5000);

    }

    @Then("^user click apply and click ok pop up warning$")
    public void userClickApplyAndClickOkPopUpWarning() throws InterruptedException {
        PemilihTetapImportData pemilihTetapImportData = new PemilihTetapImportData(webDriver);
        pemilihTetapImportData.setBtnUpload();
        Thread.sleep(3000);
        pemilihTetapImportData.setBtnConfirmation();
        Thread.sleep(3000);
    }

    @And("^user succesfully upload data$")
    public void userSuccesfullyUploadData() throws InterruptedException {
        PemilihTetapImportData pemilihTetapImportData = new PemilihTetapImportData(webDriver);
        Assert.assertTrue(pemilihTetapImportData.setVerifySuccesUpload());
        Thread.sleep(2000);
    }

    @And("^user choose file excel with blank data$")
    public void userChooseFileExcelWithBlankData() throws InterruptedException {
        PemilihTetapImportData pemilihTetapImportData = new PemilihTetapImportData(webDriver);
        pemilihTetapImportData.setChooseFileImportBlank();
        Thread.sleep(5000);
    }

    @And("^user appear warning error$")
    public void userAppearWarningError() throws InterruptedException {
        PemilihTetapImportData pemilihTetapImportData = new PemilihTetapImportData(webDriver);
        Assert.assertTrue(pemilihTetapImportData.setErrorUpload());
        Thread.sleep(2000);
    }
}
