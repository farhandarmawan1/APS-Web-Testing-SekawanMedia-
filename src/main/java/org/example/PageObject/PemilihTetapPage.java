package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PemilihTetapPage {
    public static WebDriver driver;
    public PemilihTetapPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "username")
    private WebElement fieldUserName;

    @FindBy(id = "password")
    private WebElement fieldPassword;

    @FindBy(id = "kt_login_signin_submit")
    private WebElement btnLogin;

    @FindBy(xpath = "//span[.='Pemilih Tetap']")
    private WebElement btnMenuPemilihTetap ;

    @FindBy(id = "table-inputpemilih_dtSearch")
    private WebElement fieldSearchData ;
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    private WebElement errorMessage ;

    public boolean setErrorMessage() {
        errorMessage.isDisplayed();
        return true;
    }

    public void setFieldUserName(String a) {
        fieldUserName.sendKeys(a);
    }

    public void setFieldPassword(String a) {
        fieldPassword.sendKeys(a);
    }

    public void setBtnLogin() {
        btnLogin.click();
    }

    public void setBtnMenuPemilihTetap() {
        btnMenuPemilihTetap.click();
    }

    public void setFieldSearchData(String a) {
        fieldSearchData.click();
        fieldSearchData.sendKeys(a);
    }
}
