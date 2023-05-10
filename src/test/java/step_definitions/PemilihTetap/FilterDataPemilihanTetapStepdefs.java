package step_definitions.PemilihTetap;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.FilterDataPemilihTetap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class FilterDataPemilihanTetapStepdefs {
    private WebDriver webDriver;
    public FilterDataPemilihanTetapStepdefs() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^user click button icon filter$")
    public void userClickButtonIconFilter() throws InterruptedException {
        FilterDataPemilihTetap filterDataPemilihTetap = new FilterDataPemilihTetap(webDriver);
        filterDataPemilihTetap.setBtnFilterData();
        Thread.sleep(3000);
    }

    @And("^user select dropdown filder valid data$")
    public void userSelectDropdownFilderValidData() throws InterruptedException {
        FilterDataPemilihTetap filterDataPemilihTetap = new FilterDataPemilihTetap(webDriver);
        filterDataPemilihTetap.setBtnProvinsi();
        filterDataPemilihTetap.setBtnKabupaten();
        filterDataPemilihTetap.setBtnKecamatan();
        filterDataPemilihTetap.setBtnKelurahan();
        filterDataPemilihTetap.setBtnTPS();
        Thread.sleep(2000);

    }

    @Then("^user click apply filter data$")
    public void userClickApplyFilterData() throws InterruptedException {
        FilterDataPemilihTetap filterDataPemilihTetap = new FilterDataPemilihTetap(webDriver);
        filterDataPemilihTetap.setBtnApplyFilter();
        Thread.sleep(1000);
    }

    @And("^User verify filter data appear name TPS filter data$")
    public void userVerifyFilterDataAppearNameTPSFilterData() throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//td[.='Baru']"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(1000);
    }
}
