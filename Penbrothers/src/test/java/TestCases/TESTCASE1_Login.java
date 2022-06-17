package TestCases;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DataObjects.PageObject_Home;
import DataObjects.WebDriverClass;

public class TESTCASE1_Login extends WebDriverClass{

	WebDriver driver;
	WebDriverWait wait;
	PageObject_Home homePage;
	
	@Before
	public void before() throws IOException {
		this.driver = super.initializeWebDriver(this.driver);
		this.wait = super.initializeWebDriverWait(this.driver);
		super.openWindow(this.driver, super.getValueFromExcel("01_URL", "URL", "login"));
		homePage = new PageObject_Home();
	}
	
	@Test
	public void main() throws IOException {
		homePage.navigateToLogin(this.driver,this.wait);
		homePage.login(this.driver, this.wait, super.getValueFromExcel("02_LOGIN", "Value", "ID"),
				super.getValueFromExcel("02_LOGIN", "Value", "Password"));
	}
	
	@After
	public void close() 
	{
		super.closeWindow(this.driver);
	}
}

