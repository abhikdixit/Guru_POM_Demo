package com.guru.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import come.guru.home.GuruSignInPage;

public class GuruBasePage {

	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public GuruBasePage(WebDriver driver) {
		this.driver = driver;
	}
	//	@Rule
	//	public final TestLifecycleRule testLifecycleRule = new TestLifecycleRule();


	//Sign in functionality
	public GuruSignInPage GoToHomePageAndSignIn(String username,String password) throws Exception {	
		return signInToGuruBank(username, password);		
	}
	public GuruSignInPage signInToGuruBank(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		submitButton();
		return new GuruSignInPage(driver);		
	}

	private WebElement getUserName() {
		return driver.findElement(By.name("uid"));
	}
	public void enterUserName(String username){
		getUserName().clear();
		getUserName().sendKeys(username);	
	}	

	public WebElement getPassword() {
		return getDriver().findElement(By.name("password"));
	}

	//common in both Signin & SignUp
	public void enterPassword(String password){
		getPassword().clear();
		getPassword().sendKeys(password);	
	}

	public void submitButton(){
		goToSubmit().click();	
	}

	public WebElement goToSubmit() {
		return getDriver().findElement(By.name("btnLogin"));
	}

}
