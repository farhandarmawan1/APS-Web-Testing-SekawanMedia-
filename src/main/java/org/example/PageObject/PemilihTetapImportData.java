package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PemilihTetapImportData {
    public static WebDriver driver;
    public PemilihTetapImportData(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@class='btn btn-sm btn-aps dropdown-toggle dropdown-toggle-split']")
    private WebElement btnDropDownTambah;

    @FindBy(xpath = "//a[.='Import Excel']")
    private WebElement dropdownImportData;

    @FindBy(xpath = "//input[@name='excel_file']")
    private WebElement chooseFileImport;

    @FindBy(xpath = "//button[.='Upload']")
    private WebElement btnUpload;

    @FindBy(xpath = "//button[@class='swal2-confirm btn btn-focus btn-success m-btn m-btn--pill m-btn--air swal2-styled']\n")
    private WebElement btnConfirmation;

    @FindBy(xpath = "//div[@class='swal2-success-ring']")
    private WebElement verifySuccesUpload;

    @FindBy(xpath = "//span[@class='swal2-x-mark']")
    private WebElement verifyErrorUpload;


    public void setBtnDropDownTambah() {
        btnDropDownTambah.click();
    }

    public void setDropdownImportData() {
        dropdownImportData.click();
    }

    public void setChooseFileImport() {
        String dir = System.getProperty("user.dir");
        String x = dir + "/src/test/resources/FileUpload/DataPemilihValid.xlsx";
        chooseFileImport.sendKeys(x);
    }
    public void setChooseFileImportBlank() {
        String dir = System.getProperty("user.dir");
        String x = dir + "/src/test/resources/FileUpload/DataPemilihBlank.xlsx";
        chooseFileImport.sendKeys(x);
    }

    public void setBtnUpload() {
        btnUpload.click();
    }

    public void setBtnConfirmation() {
        btnConfirmation.click();
    }

    public boolean setVerifySuccesUpload() {
        verifySuccesUpload.isDisplayed();
        return true;
    }

    public boolean setErrorUpload() {
        verifyErrorUpload.isDisplayed();
        return true;
    }
}
