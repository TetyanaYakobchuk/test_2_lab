package com.PrestaShop.SingUp;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingUpPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public SingUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }


    @FindBy(id = "input-firstname")
    private WebElement fullName;

    @FindBy(id = "input-lastname")
    private WebElement fullName2;

    @FindBy(xpath = "//*[@id=\"input-register-email\"]")
    private WebElement eMail;

    @FindBy(name = "custom_field[1]")
    private WebElement city;

    @FindBy(xpath = "//*[@id=\"input-telephone\"]")
    private WebElement phone;



    @FindBy(xpath = "//*[@id=\"input-register-password\"]")
    private WebElement password;

    @FindBy(css = "#input-confirm")
    private WebElement submitPassword;

    @FindBy(xpath = "//*[@id=\"ajax-register-form\"]/div/div/input[2]")
    private WebElement submitLogin;

    public void fillName( String strName) {
        fullName.sendKeys(strName);
    }
    public void fillName2( String strName) {
        fullName2.sendKeys(strName);
    }
    public void fillEmail( String strEmail) {eMail.sendKeys(strEmail); }
    public void fillCity(String strEmail) {city.sendKeys(strEmail); }
    public void fillPhone( String strEmail) {phone.sendKeys(strEmail); }

    public void fillPassword( String strPassword) {
        password.sendKeys(strPassword);
    }
    public void fillCPassword( String strPassword) {
        submitPassword.sendKeys(strPassword);
    }


    public void submitForm() throws InterruptedException {
        submitLogin.click();
    }

    public String getCurrentUrl() {
       return driver.getCurrentUrl();
    }

}
