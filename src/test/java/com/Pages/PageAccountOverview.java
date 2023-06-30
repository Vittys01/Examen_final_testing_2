package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageAccountOverview extends BasePage {
    By buttonAccountsOverview = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");
    By messageAcccountOverview = By.xpath("//*[@id=\"accountTable\"]/tfoot/tr/td");
    By accountNew = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a");
    By messageAcccountDetails = By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/h1");
    By buttonAccountsOverviewDetailsGo = By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/form/table/tbody/tr[3]/td[2]/input");
    By inputUsername = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
    By inputPassword = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
    By buttonLogin = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
    public PageAccountOverview(WebDriver driver) {
        // TODO Auto-generated constructor stub
    }
    public void accountOverview() throws InterruptedException {
        Thread.sleep(1000);
        oprimir(buttonAccountsOverview);
        Thread.sleep(1000);
        comparar(messageAcccountOverview,"*Balance includes deposits that may be subject to holds");
    }
    public void accountActivity() throws InterruptedException {
        Thread.sleep(1000);
        oprimir(buttonAccountsOverview);
        Thread.sleep(1000);
        comparar(messageAcccountOverview,"*Balance includes deposits that may be subject to holds");
        oprimir(accountNew);
        comparar(messageAcccountDetails,"Account Details");
        //Las opciones de account activity esta por defecto All
        oprimir(buttonAccountsOverviewDetailsGo);
    }
    public void login() throws InterruptedException{
        Thread.sleep(1000);
        teclear("Vittys", inputUsername);
        teclear("123456", inputPassword);
        oprimir(buttonLogin);
    }
}
