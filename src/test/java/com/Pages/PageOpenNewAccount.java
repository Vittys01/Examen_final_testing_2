package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageOpenNewAccount extends BasePage {

    By buttonOpenNewAccount = By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a");
    By buttonSelectAccountType = By.xpath("//*[@id=\"type\"]");
    By buttonOpenNewAccountConfirm = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input");
    By messageAccountOpened = By.xpath("//*[@id=\"rightPanel\"]/div/div/p[1]");
    By inputUsername = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By inputPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By buttonLogin = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
    public PageOpenNewAccount(WebDriver driver) {
        // TODO Auto-generated constructor stub
    }
    public void openNewAccount() throws InterruptedException {
        Thread.sleep(1000);
        oprimir(buttonOpenNewAccount);
        Thread.sleep(1000);
        Select accountType = new Select(findElement(buttonSelectAccountType));
        Thread.sleep(1000);
        accountType.selectByVisibleText("SAVINGS");
        Thread.sleep(1000);
        oprimir(buttonOpenNewAccountConfirm);
        Thread.sleep(1000);
        comparar(messageAccountOpened,"Congratulations, your account is now open.");
    }
    public void login() throws InterruptedException{
        Thread.sleep(1000);
        teclear("Vittys", inputUsername);
        teclear("123456", inputPassword);
        oprimir(buttonLogin);
    }
}
