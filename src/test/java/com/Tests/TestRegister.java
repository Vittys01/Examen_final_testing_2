package com.Tests;

import com.Pages.PageRegister;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class TestRegister {

	private WebDriver driver;

	PageRegister pageRegister;

	@BeforeEach
	public void setUp() throws Exception {
		pageRegister = new PageRegister(driver);
		driver = pageRegister.chromeDriverConnection();
		pageRegister.link("https://parabank.parasoft.com/parabank/index.htm");
	}

	@AfterEach
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		pageRegister.register();
	}

}
