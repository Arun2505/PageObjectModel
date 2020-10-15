package com.TestLeaf.QA.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TestLeaf.QA.Base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(how = How.ID,using="username")
	WebElement username;

	@FindBy(how = How.ID,using="password")
	WebElement password;

	@FindBy(how = How.CLASS_NAME,using="decorativeSubmit")
	WebElement submit_button;

	@FindBy(xpath = "(//div[@id='logo'])//img")
	WebElement Testleaflogo;
	
	@FindBy(how = How.LINK_TEXT,using="CRM/SFA")
	WebElement Click_CCRM;
	
//	@FindBy(how = How.XPATH,using="(//div//div//div//div//ul//li)[1]")
//	WebElement CreateLeadClick;
	
	
	//Intialize the page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public String Login_Title() {
		 return driver.getTitle();
	}
	
	public boolean ValidateTestLeafLogo() {
		return Testleaflogo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		submit_button.click();
		Click_CCRM.click();
		//CreateLeadClick.click();
		
		return new HomePage();
		
	}
	
	

}










