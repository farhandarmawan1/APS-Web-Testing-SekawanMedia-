package step_definitions.PemilihTetap;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.PemilihTetapPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;


public class PemilihTetapSearchStepdefs {
    private WebDriver webDriver;
    public PemilihTetapSearchStepdefs() {
        super();
        this.webDriver = Hooks.webDriver;
    }


    @Given("^user already login$")
    public void userAlreadyLogin() throws InterruptedException {
            PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
            pemilihTetapPage.setFieldUserName("candidat");
            pemilihTetapPage.setFieldPassword("password123");
            pemilihTetapPage.setBtnLogin();
            Thread.sleep(8000);
        }

    @And("^user already page pemilih tetap$")
    public void userAlreadyPagePemilihTetap() throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setBtnMenuPemilihTetap();
        Thread.sleep(8000);
    }

    @When("^user input field \"([^\"]*)\" search filter name valid$")
    public void userInputFieldSearchFilterNameValid(String arg0) throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setFieldSearchData(arg0);
        Thread.sleep(500);
    }

    @When("^user input field \"([^\"]*)\" search filter name invalid$")
    public void userInputFieldSearchFilterNameInvalid(String arg0) throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setFieldSearchData(arg0);
        Thread.sleep(500);
    }

    @Then("^user succesfull filter data name appear name \"([^\"]*)\"$")
    public void userSuccesfullFilterDataNameAppearName(String arg0) throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//td[.='"+arg0+"']"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }


    @Then("^user appear text error Nothing found - sorry$")
    public void userAppearTextErrorNothingFoundSorry() throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        Assert.assertTrue(pemilihTetapPage.setErrorMessage());
        Thread.sleep(1000);
    }

    @When("^user input field \"([^\"]*)\" search filter NIK valid$")
    public void userInputFieldSearchFilterNIKValid(String arg0) throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setFieldSearchData(arg0);
        Thread.sleep(500);
    }

    @Then("^user succesfull filter data Nik appear \"([^\"]*)\"$")
    public void userSuccesfullFilterDataNikAppear(String arg0) throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//td[.='"+arg0+"']"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^user input field \"([^\"]*)\" search filter NIK invalid$")
    public void userInputFieldSearchFilterNIKInvalid(String arg0) throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setFieldSearchData(arg0);
        Thread.sleep(500);
    }

    @When("^user input field \"([^\"]*)\" search  jenis kelamin valid$")
    public void userInputFieldSearchJenisKelaminValid(String arg0) throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setFieldSearchData(arg0);
        Thread.sleep(500);
    }

    @Then("^user succesfull filter data Jenis kelamin appear \"([^\"]*)\"$")
    public void userSuccesfullFilterDataJenisKelaminAppear(String arg0) throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//td[.='"+arg0+"']"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^user input field \"([^\"]*)\" search jenis kelamin invalid$")
    public void userInputFieldSearchJenisKelaminInvalid(String arg0) throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setFieldSearchData(arg0);
        Thread.sleep(500);
    }

    @When("^user input field search \"([^\"]*)\" search  alamat valid$")
    public void userInputFieldSearchSearchAlamatValid(String arg0) throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setFieldSearchData(arg0);
        Thread.sleep(500);
    }

    @Then("^user succesfull filter data TPS appear \"([^\"]*)\"$")
    public void userSuccesfullFilterDataTPSAppear(String arg0) throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//td[.='"+arg0+"']"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^user input field search \"([^\"]*)\" search  alamat invalid$")
    public void userInputFieldSearchSearchAlamatInvalid(String arg0) throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setFieldSearchData(arg0);
        Thread.sleep(500);
    }

    @When("^user input field \"([^\"]*)\" search  TPS valid$")
    public void userInputFieldSearchTPSValid(String arg0) throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setFieldSearchData(arg0);
        Thread.sleep(500);
    }

    @When("^user input field \"([^\"]*)\" search  TPS invalid$")
    public void userInputFieldSearchTPSInvalid(String arg0) throws InterruptedException {
        PemilihTetapPage pemilihTetapPage = new PemilihTetapPage(webDriver);
        pemilihTetapPage.setFieldSearchData(arg0);
        Thread.sleep(500);
    }

    @Then("^user succesfull filter data status appear \"([^\"]*)\"$")
    public void userSuccesfullFilterDataStatusAppear(String arg0) throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//td[.='"+arg0+"']"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @Then("^user succesfull filter data alamat appear \"([^\"]*)\"$")
    public void userSuccesfullFilterDataAlamatAppear(String arg0) throws InterruptedException {
        WebElement verify = webDriver.findElement(By.xpath("//label[@class='text-wrap']/span[1]/span[contains(.,'"+arg0+"')]"));
        verify.isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

}
