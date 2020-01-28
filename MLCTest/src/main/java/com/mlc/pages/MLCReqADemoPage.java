package com.mlc.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MLCReqADemoPage extends PageObject{

	
	@FindBy(xpath="//label[contains(text(),'Name')]//following::input[1]")
	WebElementFacade nametxtField;
	
	@FindBy(xpath="//label[contains(text(),'Email')]//following::input[1]")
	WebElementFacade emailIDtxtField;
	
	
	@FindBy(xpath="//label[contains(text(),'Phone')]//following::input[1]")
	WebElementFacade phnNumtxtField;
	
	
	public void fillUpName(String userName) {
		nametxtField.sendKeys(userName);
	}

	public void emailID(String userEmail) {
		emailIDtxtField.sendKeys(userEmail);
	}
	
	public void phnnuM(String userPhn) {
		phnNumtxtField.sendKeys(userPhn);
	}
	


}
