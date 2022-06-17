package DataObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_Home{
	By Sign_In = By.xpath("//a[@id='signinlink']");
	By h5_Sign_In = By.xpath("//h5[contains(text(),'Sign')]");
	By textField_Username = By.id("username");
	By textField_Password = By.id("password");
	By button_SignIn = By.xpath("(//span[contains(text(),'Sign in')])[1]");
	By text_loginName = By.xpath("//span[contains(text(),'lourdestest')]");
	By link_7DaysFreeTrial = By.xpath("//a[contains(@href,'freetrial')]");
	By text_ActivateYour7DayFreeTrial = By.xpath("//h1[contains(text(), 'Activate your 7-Day FREE trial')]");

	By link_MyProfile = By.xpath("(//a[contains(text(),'My Profile')])[1]");
	By h1Text_LourdesTest = By.xpath("//h1[contains(text(), 'lourdestest')]");
	
	By textField_KeywordInput = By.xpath("//input[@id='keyword-input']");
	By button_SearchButton = By.xpath("(//button[@title=\"Search\"])[1]");
	By text_TimesAdvocate = By.xpath("(//b[contains(text(),'Times-Advocate')])[1]");
	
	public void navigateToLogin(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Sign_In));
		driver.findElement(Sign_In).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(h5_Sign_In));
	}
	
	public void login(WebDriver driver, WebDriverWait wait, String login, String password) {
		driver.findElement(textField_Username).sendKeys(login);
		driver.findElement(textField_Password).sendKeys(password);
		driver.findElement(button_SignIn).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(text_loginName));
	}
	
	public void goTo7DaysFreeTrial(WebDriver driver, WebDriverWait wait) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(link_7DaysFreeTrial));
		driver.findElement(link_7DaysFreeTrial).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(text_ActivateYour7DayFreeTrial));
	}
	
	public void goToMyProfile(WebDriver driver, WebDriverWait wait, Actions actions) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(text_loginName));
		actions.click(driver.findElement(text_loginName)).click(driver.findElement(link_MyProfile)).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(h1Text_LourdesTest));
		
	}
	
	public void searchKeyword(WebDriver driver, WebDriverWait wait, String input) throws InterruptedException {
		System.out.println("TextField Now");
		wait.until(ExpectedConditions.presenceOfElementLocated(textField_KeywordInput));
		driver.findElement(textField_KeywordInput).sendKeys(input);
		driver.findElement(button_SearchButton).click();
		System.out.println("TextField After");

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(text_TimesAdvocate));
	}
	
	
	
	
}
