package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PageRegister extends BasePage {

    By buttomRegister = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    By inputFirstName = By.id("customer.firstName");
    By inputLastname = By.id("customer.lastName");
    By inputAddress = By.id("customer.address.street");
    By inputCity = By.id("customer.address.city");
    By inputState = By.id("customer.address.state");
    By inputZipCode = By.id("customer.address.zipCode");
    By inputPhone = By.id("customer.phoneNumber");
    By inputSsn = By.id("customer.ssn");
    By inputUsername = By.id("customer.username");
    By inputPassword = By.id("customer.password");
    By inputPasswordConfirm = By.id("repeatedPassword");
    By buttomRegisterConfirm = By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input");
    By messageWelcome = By.xpath("//*[@id=\"rightPanel\"]/p");
    public PageRegister(WebDriver driver) {
        // TODO Auto-generated constructor stub
    }

    public void register() throws InterruptedException {
        Thread.sleep(1000);
        oprimir(buttomRegister);
        Thread.sleep(1000);
        teclear("Vittys",inputFirstName);
        Thread.sleep(1000);
        teclear("Bernal",inputLastname);
        Thread.sleep(1000);
        teclear("Calle 21",inputAddress);
        Thread.sleep(1000);
        teclear("Cucuta",inputCity);
        Thread.sleep(1000);
        teclear("as",inputState);
        Thread.sleep(1000);
        teclear("21",inputZipCode);
        Thread.sleep(1000);
        teclear("300000000",inputPhone);
        Thread.sleep(1000);
        teclear("Cal 21",inputSsn);
        Thread.sleep(1000);
        teclear("Vittys",inputUsername);
        Thread.sleep(1000);
        teclear("123456",inputPassword);
        Thread.sleep(1000);
        teclear("123456",inputPasswordConfirm);
        Thread.sleep(1000);
        oprimir(buttomRegisterConfirm);
        comparar(messageWelcome,"Your account was created successfully. You are now logged in.");
    }

}
