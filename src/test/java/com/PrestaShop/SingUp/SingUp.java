package com.PrestaShop.SingUp;

import com.PrestaShop.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class SingUp extends WebDriverSettings {

   @Test
    public void corrupted_email() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);

        singUpPage.fillName("name");
        singUpPage.fillName2("name2");
        singUpPage.fillEmail("q");
        singUpPage.fillCity("City");
        singUpPage.fillPhone("380000000000");
        singUpPage.fillPassword("Password");
        singUpPage.fillCPassword("Password");
        singUpPage.submitForm();
       Thread.sleep(100);
        Assert.assertTrue(driver.getPageSource().contains("Адрес электронной почты не правильный!"));
    }
    @Test
    public void corrupted_phone() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);

        singUpPage.fillName("name");
        singUpPage.fillName2("name2");
        singUpPage.fillEmail("q@gmail.com");
        singUpPage.fillCity("City");
        singUpPage.fillPhone("380000000000");
        singUpPage.fillPassword("Password");
        singUpPage.fillCPassword("Password");
        singUpPage.submitForm();
        Thread.sleep(100);
        Assert.assertTrue(driver.getPageSource().contains("Номер телефона не правильный!"));
    }
    @Test
    public void corrupted_2password() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
int a=1/0;
        singUpPage.fillName("name");
        singUpPage.fillName2("name2");
        singUpPage.fillEmail("q@gmail.com");
        singUpPage.fillCity("City");
        singUpPage.fillPhone("380000000000");
        singUpPage.fillPassword("Password");
        singUpPage.fillCPassword("Password1");
        singUpPage.submitForm();
        Thread.sleep(100);
        Assert.assertTrue(driver.getPageSource().contains("Подтверждение пароля: не совпали пароли!"));
    }
    @Test
    public void corrupted_password() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);

        singUpPage.fillName("name");
        singUpPage.fillName2("name2");
        singUpPage.fillEmail("q@gmail.com");
        singUpPage.fillCity("City");
        singUpPage.fillPhone("380000000000");
        singUpPage.fillPassword("Pas");
        singUpPage.fillCPassword("Pas");
        singUpPage.submitForm();
        Thread.sleep(100);
        Assert.assertTrue(driver.getPageSource().contains("Пароль должен быть от 4 до 20 символов!"));
    }
    @Test
    public void corrupted_name() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);

        singUpPage.fillName("@");
        singUpPage.fillName2("@");
        singUpPage.fillEmail("q@gmail.com");
        singUpPage.fillCity("City");
        singUpPage.fillPhone("380000000000");
        singUpPage.fillPassword("Pas");
        singUpPage.fillCPassword("Pas");
        singUpPage.submitForm();
        Thread.sleep(100);
        Assert.assertTrue(driver.getPageSource().contains("Имя не правильное!"));
    }


}
