package com.mlc.cucumber.steps;

import com.mlc.cucumber.serenity.MLCLifeViewSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LifeviewPageStepdef {

	@Steps
	MLCLifeViewSteps MLCViewsteps;
	
	@When("^verify for bread crumb content on LifeView Page$")
	public void verify_for_bread_crumb_content_on_LifeView_Page() {
		
		MLCViewsteps.verifyBreadCrumbsContentOnLifeViewPage();
		
	}

	@Then("^User clicks on Request a Demo button$")
	public void user_clicks_on_Request_a_Demo_button() {
		
	  MLCViewsteps.clickOnRequestADemo();
	}

	
	
	
}
