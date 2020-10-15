package com.TestLeaf.QA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.TestLeaf.QA.Base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(how = How.XPATH,using="(//div//div//div//div//ul//li)[1]")
	WebElement CreateLeadClick;
	
	@FindBy(how = How.ID,using="createLeadForm_companyName")
	WebElement CompanyName;
	
	@FindBy(how = How.ID,using="createLeadForm_firstName")
	WebElement FirstName;
	
	@FindBy(how = How.ID,using="createLeadForm_lastName")
	WebElement LastName;
	
	@FindBy(how = How.NAME,using="submitButton")
	WebElement Submit_CreateLead;
	
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}	

	
	public Find_Leads_Page Home_page(String company,String first,String last) {
		CreateLeadClick.click();
		CompanyName.sendKeys(company);
		FirstName.sendKeys(first);
		LastName.sendKeys(last);
		Submit_CreateLead.click();
		
		return new Find_Leads_Page();
		
		
	}

}






