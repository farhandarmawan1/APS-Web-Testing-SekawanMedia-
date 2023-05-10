package org.example.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterDataPemilihTetap {
    public static WebDriver driver;
    public FilterDataPemilihTetap(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@class='btn btn-sm btn-light-aps d-flex justify-content-center']")
    private WebElement btnFilterData;

    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    private WebElement btnApplyFilter;

    @FindBy(xpath = "//span[@id='select2-filter_provinsi_id-container']")
    private WebElement btnProvinsi;

    @FindBy(xpath = "//div[@class='modal fade show']//span[@class='selection']/span[.='- Pilih Kota/Kabupaten -']")
    private WebElement btnKabupaten;

    @FindBy(xpath = "//span[@id='select2-filter_kecamatan_id-container']")
    private WebElement btnKecamatan;

    @FindBy(xpath = "//span[@id='select2-filter_kelurahan_id-container']")
    private WebElement btnKelurahan;

    @FindBy(xpath = "//span[@id='select2-filter_tps_id-container']")
    private WebElement btnTPS;

    public void setdropdownFilter(String a) throws InterruptedException {
        WebElement b = driver.findElement(By.xpath("//li[text()='"+a+"']"));
        b.click();
        Thread.sleep(1000);
    }

    public void setBtnFilterData() {
        btnFilterData.click();
    }

    public void setBtnApplyFilter() {

        btnApplyFilter.click();
    }

    public void setBtnProvinsi() throws InterruptedException {

        btnProvinsi.click();
        setdropdownFilter("Bengkulu");
    }

    public void setBtnKabupaten() throws InterruptedException {
        btnKabupaten.click();
        setdropdownFilter("Rejang Lebong");
    }

    public void setBtnKecamatan() throws InterruptedException {
        btnKecamatan.click();
        setdropdownFilter("Curup");
    }

    public void setBtnKelurahan() throws InterruptedException {
        btnKelurahan.click();
        setdropdownFilter("Jalan Baru");
    }

    public void setBtnTPS() throws InterruptedException {
        btnTPS.click();
        setdropdownFilter("Baru");
    }



}
