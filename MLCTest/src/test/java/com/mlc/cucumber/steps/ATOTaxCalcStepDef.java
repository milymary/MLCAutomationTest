package com.mlc.cucumber.steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mlc.cucumber.serenity.ATOSimpleTaxCalcSteps;
import com.mlc.cucumber.serenity.MLCLifeViewSteps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("testdata/ATOTaxCalTestData.csv")

public class ATOTaxCalcStepDef {
	
	@Managed(driver="chrome", uniqueSession = true)                              
	WebDriver driver;
	
	
	
	private String incomeYear;
	private float taxableIncome;
    private String residencyStatus;
    private String monthsOfResidency;
    private float calculatedTaxExpected;
   
   
	@Steps
	ATOSimpleTaxCalcSteps ATOCalc;
	
	@Given("^User is on the ATO Simple Tax Calculator Page as provided$")
	public void verifyifOnATOTaxCalcSite() {
		ATOCalc.verifyIfOnHomePage();
		
	}
	@When("^All Mandatory fields (.*), (.*), (.*), (.*) are filled in the form and submitted$")
	public void searches_and_traverses_to_Simple_Tax_calculator_page(String incYr,String taxInc, String resStat ,String mnthsOfres ) {
		
		
		ATOCalc.enterAllMandatoryFields(incYr,taxInc,resStat,mnthsOfres);
		ATOCalc.submitTheForm();
	}
	
	@Then("^Calculated tax (.*) is verified$")
	public void calculated_tax_is_verified(String calcTax) {
		ATOCalc.verifyCalculatedTax(calcTax);
	}
	
	
	

}
