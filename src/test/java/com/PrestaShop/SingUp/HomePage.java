package com.PrestaShop.SingUp;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[5]/button/span")
    private WebElement button1;
    @FindBy(xpath = "//*[@id=\"ajax-login-form\"]/div[3]/button[2]")
    WebElement button2;
    public void open() {
        driver.get("https://www.td-salomeya.ru/");


        button1.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ajax-login-form\"]/div[3]/button[2]")));
        button2.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-firstname")));
    }


}
