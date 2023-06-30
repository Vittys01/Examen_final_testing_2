package com.Tests;

import com.Pages.PageAccountOverview;
import com.Pages.PageOpenNewAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestOpenNewAccount {
    private WebDriver driver;
    PageOpenNewAccount pageOpenNewAccount;

    @BeforeEach
    public void setUp() throws Exception {

        pageOpenNewAccount = new PageOpenNewAccount(driver);
        driver = pageOpenNewAccount.chromeDriverConnection();
        pageOpenNewAccount.link("https://parabank.parasoft.com/parabank/index.htm");
    }

    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        pageOpenNewAccount.login();
        pageOpenNewAccount.openNewAccount();
    }

}