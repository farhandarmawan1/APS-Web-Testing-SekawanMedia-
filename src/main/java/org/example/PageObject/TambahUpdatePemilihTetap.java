package org.example.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TambahUpdatePemilihTetap {
    public static WebDriver driver;
    public TambahUpdatePemilihTetap(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@class='btn btn-aps font-weight-bolder btn-sm']")
    private WebElement btnTambah;

    @FindBy(id = "pemilih_kk")
    private WebElement fieldKK;

    @FindBy(id = "pemilih_nik")
    private WebElement fieldNIK;

    @FindBy(id = "pemilih_nama")
    private WebElement fieldNama;

    @FindBy(id = "pemilih_alamat")
    private WebElement fieldAlamat;

    @FindBy(id = "pemilih_rt")
    private WebElement fieldRt;

    @FindBy(id = "pemilih_rw")
    private WebElement fieldRw;

    @FindBy(id = "pemilih_tempat_lahir")
    private WebElement fieldTempatLahir;

    @FindBy(id = "pemilih_tgl_lahir")
    private WebElement fieldTglLahir;

    @FindBy (id = "select2-pemilih_kelurahan_id-container")
    private WebElement selectKelurahan;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement fieldKelurahan;

    @FindBy(xpath = "//div[@class='col-8 col-form-label']//label[1]/span[1]")
    private WebElement radioJenisKelamin;

    @FindBy(xpath = "//div[@id='Statusradio']/label[2]/span[1]")
    private WebElement radioStatus;

    @FindBy(css = "[aria-labelledby='select2-pemilih_status_kawin-container']")
    private WebElement selectStatusKawin;
    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputStatusKawin;
    @FindBy(xpath = "//div[@class='row col-12']//span[@class='selection']/span[.='- Pilih Caleg -']")
    private WebElement selectCaleg;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputCaleg;

    @FindBy(css = "[aria-labelledby='select2-pemilih_tps_id-container']")
    private WebElement clickTps;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputTps;

    @FindBy(xpath = "//div[@id='Statusradio']/label[2]/span[1]")
    private WebElement statusPemilih;

    @FindBy(xpath = "//button[@id='btn-simpan']")
    private WebElement btnSimpan;

    @FindBy(xpath = "//tr[3]//i[@class='icon far fa-edit']")
    private WebElement btnUpdate;

    public void setBtnUpdate(){
        btnUpdate.click();
    }



    public void setBtnTambah() {
        btnTambah.click();
    }

    public void setFieldKK(String a) {
        fieldKK.sendKeys(a);
    }

    public void setFieldNIK(String a) {
        fieldNIK.sendKeys(a);
    }

    public void setFieldNama(String a) {
        fieldNama.clear();
        fieldNama.sendKeys(a);
    }

    public void setFieldAlamat(String a) {
        fieldAlamat.sendKeys(a);
    }

    public void setFieldRt(String a) {
        fieldRt.sendKeys(a);
    }

    public void setFieldRw(String a) {
        fieldRw.sendKeys(a);
    }

    public void setFieldTempatLahir(String a) {
        fieldTempatLahir.sendKeys(a);
    }

    public void setSelectKelurahan(String a) {
        selectKelurahan.click();
        fieldKelurahan.sendKeys(a);
        fieldKelurahan.sendKeys(Keys.RETURN);
    }
    public void setFieldTglLahir(String a) {
        fieldTglLahir.sendKeys(a);
        fieldKK.click();
    }

    public void setRadioJenisKelamin(){
        radioJenisKelamin.click();
    }

    public void setSelectCaleg(String a){
        selectCaleg.click();
        inputCaleg.sendKeys(a);
        inputCaleg.sendKeys(Keys.RETURN);
    }

    public void setSelectStatusKawin(String a) {
        selectStatusKawin.click();
        inputStatusKawin.sendKeys(a);
        inputStatusKawin.sendKeys(Keys.RETURN);
    }

    public void setClickTps(String a) {
        clickTps.click();
        inputTps.sendKeys(a);
        inputTps.sendKeys(Keys.RETURN);
    }

    public void setRadioStatus() {
       radioStatus.click();
    }

    public void setBtnSimpan() {
        btnSimpan.click();
    }
}
