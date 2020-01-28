package com.mlc.cucumber.steps;

import org.hamcrest.core.Is;

import com.mlc.cucumber.serenity.AusPostAPISteps;
import com.mlc.utils.ReusableSpecifications;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class AusPostAPIStepDef {
	
	@Steps
	AusPostAPISteps ausPostStep;

	@Given("^User sends a GET Request to calculate shipping costs (.*) for a parcel of weight (.*) to country (.*) and response is validated$")
	public void validateShippingCosts(String expectedCost, String wghtInKG, String countryCode) {
		ausPostStep.requestValidationForAusPostAPI(expectedCost,wghtInKG,countryCode);
		
		   
		}
		
		
		
		
	//  \"([^\"]*)]	
		
	
	
	
}
