package com.Tests;


import com.Pages.PageTransferFounds;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestTransferFounds {
    private WebDriver driver;
    PageTransferFounds pageTransferFounds;

    @BeforeEach
    public void setUp() throws Exception {

        pageTransferFounds = new PageTransferFounds(driver);
        driver = pageTransferFounds.chromeDriverConnection();
        pageTransferFounds.link("https://parabank.parasoft.com/parabank/index.htm");
    }

    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        pageTransferFounds.login();
        pageTransferFounds.transferFounds();
    }
}
