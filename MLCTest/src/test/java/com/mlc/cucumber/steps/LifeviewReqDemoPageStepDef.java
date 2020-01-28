package com.mlc.cucumber.steps;

import java.util.Map;

import com.mlc.cucumber.serenity.MLCLifeViewSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class LifeviewReqDemoPageStepDef {

	@Steps
	MLCLifeViewSteps MLCViewsteps;
	
	@Then("^Form is filled with relevant mandatory content and not submitted$")
	public void form_is_filled_with_relevant_content_and_not_submitted(DataTable userDetails) {
		for (Map<String, String> data : userDetails.asMaps(String.class, String.class)) {  
			
			String userName= data.get("Name");
			String userEmail= data.get("EmailID");
			String userPhn=data.get("Phone");
			
			MLCViewsteps.fillReqADemoForm(userName, userEmail, userPhn);
		}
		

	}

	
	
}
