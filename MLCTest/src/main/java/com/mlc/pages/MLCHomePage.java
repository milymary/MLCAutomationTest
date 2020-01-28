package com.mlc.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.DefaultUrl;
	
@DefaultUrl("https://www.mlcinsurance.com.au/") 
public class MLCHomePage extends PageObject{
	
	@FindBy(xpath="//a/img[@alt='MLCL Logo']")
	WebElementFacade mlclogo;
	
	@FindBy(xpath = "//nav[@id='nav-onscreen']/button[@aria-label='Toggle search']")
	WebElementFacade toggleSearchbtn;
	
	@FindBy(id="q")
	WebElementFacade searchBar;
	
	@FindBy(xpath="//div[@id='q-autocomplete-results']/div[1]/ul/li")
	List<WebElement> searchResults;
	

	//verifying if on home page
	public boolean onhomePage() throws InterruptedException {
		waitFor(mlclogo);
		return mlclogo.isDisplayed();
		
		
	}
    
	//traversing to toggle Search button
	public void traverseToToggleSearchbutton() {
		toggleSearchbtn.click();
	}

	//searching for the string on the toggle search bar
	public void typeSearch(String stringSearch) {
		searchBar.sendKeys(stringSearch);
	}

	//selecting content form dropdown
	public void selectTyped(String stringSearch) {
		 waitForCondition().until(
		            ExpectedConditions.visibilityOfAllElements(searchResults)
		    );
		 
		 List<WebElement> list = searchResults;
			
			System.out.println("Auto Suggest List ::" + list.size());
			
			//looping thorugh a list of auto suggested items and searching for the content we want to be clicked.
			for(int i = 0 ;i< list.size();i++)
			{
				System.out.println(list.get(i).getText());
				
				if(list.get(i).getText().startsWith(stringSearch))
				{
					list.get(i).click();
					System.out.println("clicked");
					break;
				}else {
					System.out.println("not clicked");
				}
			}
		
		
	}

}
