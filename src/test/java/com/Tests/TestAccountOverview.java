package com.Tests;

import com.Pages.PageAccountOverview;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestAccountOverview {
    private WebDriver driver;
    PageAccountOverview pageAccountOverview;

    @BeforeEach
    public void setUp() throws Exception {

        pageAccountOverview = new PageAccountOverview(driver);
        driver = pageAccountOverview.chromeDriverConnection();
        pageAccountOverview.link("https://parabank.parasoft.com/parabank/index.htm");
    }

    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        pageAccountOverview.login();
        pageAccountOverview.accountOverview();
    }
    @Test
    public void test2() throws InterruptedException {
        pageAccountOverview.login();
        pageAccountOverview.accountActivity();
    }
}
