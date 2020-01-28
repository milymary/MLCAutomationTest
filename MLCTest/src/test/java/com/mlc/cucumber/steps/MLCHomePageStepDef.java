package com.mlc.cucumber.steps;
	

import org.openqa.selenium.WebDriver;

import com.mlc.cucumber.serenity.MLCLifeViewSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class MLCHomePageStepDef {

	@Managed(driver="chrome", uniqueSession = true)                              
	WebDriver driver;
	
	
	@Steps
	MLCLifeViewSteps MLCViewsteps;
	
	@Given("^User is on the MLC Insurance homepage$")
	public void user_is_on_the_MLC_Insurance_homepage() throws Exception {
		
		driver.navigate().to("https://www.mlcinsurance.com.au/");
		MLCViewsteps.verifyIfOnHomePage();

	    	
	}

	@And("^Searches for \"([^\"]*)\" on the Homepage$")
	public void searches_for_Lifeview_on_the_Homepage(String stringSearch)  {
	   
		MLCViewsteps.searchUsingToggleSearch(stringSearch);

	}

	
	
}
