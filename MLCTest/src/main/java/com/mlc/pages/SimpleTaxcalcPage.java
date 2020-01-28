package com.mlc.pages;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class SimpleTaxcalcPage extends PageObject {


	@FindBy(xpath="//select[@name='ddl-financialYear']")
	WebElementFacade incomeYrdrpdown;
	
	@FindBy(xpath="//select[@name='ddl-residentPartYearMonths']")
	WebElementFacade monthsOfResd;
	
	@FindBy(xpath="//input[@name='texttaxIncomeAmt']")
	WebElementFacade taxableincometxt;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElementFacade submitBtn;
	
	
	public void selectFinyear(String incYr) {
	
	incomeYrdrpdown.selectByVisibleText(incYr);
    
	}
	
	public void entertaxableIncome(String taxInc) {
		taxableincometxt.sendKeys(taxInc.trim());
	
		
	}
	
	public void selectResidencyStat(String resStat) {
		String residencyInputParam=resStat.trim();
		
		WebElement residencyStatradioBtn = getDriver().findElement(By.xpath("//span[contains(text(),'"+residencyInputParam+"')]"));
		residencyStatradioBtn.click();
		
	}

	public void selectMonthsOfResidency(String mnthsOfres) {
		
		monthsOfResd.selectByVisibleText(mnthsOfres.trim());
	}
	
	public void submitForm() {
		submitBtn.click();
	}
}
