package com.mlc.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TaxCalcResultPage extends PageObject {

	
	@FindBy(xpath="//div[@class='alert alert-attention']/div/p")
	WebElementFacade resultTabContent;
	
	
	
	public boolean verifyCalculatedTax(String calcTax){
		waitFor(resultTabContent);
		System.out.println("resultTabContent:  " +resultTabContent.getText().replace(",", ""));
		return resultTabContent.getText().replace(",", "").contains(calcTax);
		
		
		
	}
	
}
