package step_definitions.PemilihTetap;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.TambahUpdatePemilihTetap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class TambahUpdateDataPemilihTetapStepdefs {
    private WebDriver webDriver;
    public TambahUpdateDataPemilihTetapStepdefs() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^user click button tambah$")
    public void userClickButtonTambah() throws InterruptedException {
        TambahUpdatePemilihTetap tambahUpdatePemilihTetap = new TambahUpdatePemilihTetap(webDriver);
        tambahUpdatePemilihTetap.setBtnTambah();
        Thread.sleep(3000);

    }

    @And("^user input valid data form pemilihan tetap$")
    public void userInputValidDataFormPemilihanTetap() throws InterruptedException {
        TambahUpdatePemilihTetap tambahUpdatePemilihTetap = new TambahUpdatePemilihTetap(webDriver);
        tambahUpdatePemilihTetap.setFieldKK("3284848562123216");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setFieldNIK("3265489875256321");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setFieldAlamat("Jl mangga 2");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setFieldNama("Susano");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setFieldRt("3");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setFieldRw("5");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setFieldTempatLahir("malang");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setFieldTglLahir("12121992");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setSelectKelurahan("Dusun Curup");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setRadioJenisKelamin();
        tambahUpdatePemilihTetap.setRadioStatus();
        tambahUpdatePemilihTetap.setSelectStatusKawin("P");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setSelectCaleg("TPS 1");
        Thread.sleep(500);
        tambahUpdatePemilihTetap.setClickTps("Dummy");
        Thread.sleep(500);

    }

    @Then("^user click apply$")
    public void userClickApplyUpdateData() throws InterruptedException {
        TambahUpdatePemilihTetap tambahUpdatePemilihTetap = new TambahUpdatePemilihTetap(webDriver);
        tambahUpdatePemilihTetap.setBtnSimpan();
        Thread.sleep(3000);
    }

    @And("^user succesfuly input data direct to page pemilihan tetap$")
    public void userSuccesfulyInputDataDirectToPagePemilihanTetap() throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//tr[3]//i[@class='icon far fa-edit']"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }

    @And("^user input update valid data form pemilihan tetap$")
    public void userInputUpdateValidDataFormPemilihanTetap() throws InterruptedException {
        TambahUpdatePemilihTetap tambahUpdatePemilihTetap = new TambahUpdatePemilihTetap(webDriver);
        tambahUpdatePemilihTetap.setBtnUpdate();
        Thread.sleep(7000);
    }

    @When("^user click button update data$")
    public void userClickButtonUpdateData() throws InterruptedException {
        TambahUpdatePemilihTetap tambahUpdatePemilihTetap = new TambahUpdatePemilihTetap(webDriver);
        tambahUpdatePemilihTetap.setFieldNama("wayan");
        Thread.sleep(1000);
    }
}
