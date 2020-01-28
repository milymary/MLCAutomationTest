package com.mlc.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.rest.Ensure;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mlcinsurance.com.au/")
public class MLCLifeViewPage extends PageObject{

	
	@FindBy(xpath="//ul[@itemprop='breadcrumb']")
	WebElementFacade lifeviewBreadCrumb;
	
	@FindBy(xpath="//a/span[contains(text(),'Request a demo')]")
	WebElementFacade reqDemobtn;
			
	
			
	public boolean verifyBreadCrumbContent() {
		
		waitFor(lifeviewBreadCrumb);
		System.out.println("lifeviewBreadCrumb content :"+lifeviewBreadCrumb.getText());
		boolean validated=lifeviewBreadCrumb.getText().contains("Home Partnering with us Superannuation funds LifeView");
		
		return validated;
	}
	
	
	public void traverseToReqToDemoBtn() {
		// JavascriptExecutor js = (JavascriptExecutor)driver;
        // js.executeScript("window.scrollBy(0,500)", "");
		Actions actions = new Actions(getDriver());
		actions.moveToElement(reqDemobtn);
		actions.build().perform();
		reqDemobtn.click();
         
	}
	
}
