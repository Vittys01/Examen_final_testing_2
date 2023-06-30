package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageTransferFounds extends BasePage {
    By buttonTransferFounds = By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a");
    By messageTransferFounds = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");
    By inpurtTranfer = By.id("amount");
    By selectAccount = By.id("fromAccountId");
    By buttonTransferConfirm = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input");
    By messageTransferComplete = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");
    By inputUsername = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By inputPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By buttonLogin = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
    public PageTransferFounds(WebDriver driver) {
        // TODO Auto-generated constructor stub
    }
    public void transferFounds() throws InterruptedException {
        Thread.sleep(1000);
        oprimir(buttonTransferFounds);
        Thread.sleep(1000);
        comparar(messageTransferFounds,"Transfer Funds");
        teclear("1234",inpurtTranfer);
        Thread.sleep(1000);
        Select accountType = new Select(findElement(selectAccount));
        Thread.sleep(1000);
        accountType.selectByVisibleText("17784");
        Thread.sleep(1000);
        oprimir(buttonTransferConfirm);
        Thread.sleep(1000);
        comparar(messageTransferComplete,"Transfer Complete!");
    }
    public void login() throws InterruptedException{
        Thread.sleep(1000);
        teclear("Vittys", inputUsername);
        teclear("123456", inputPassword);
        oprimir(buttonLogin);
    }
}
