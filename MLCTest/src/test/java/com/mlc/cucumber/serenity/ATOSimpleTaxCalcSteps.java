package com.mlc.cucumber.serenity;

import com.mlc.pages.ATOHomepage;
import com.mlc.pages.MLCHomePage;
import com.mlc.pages.MLCLifeViewPage;
import com.mlc.pages.SimpleTaxcalcPage;
import com.mlc.pages.TaxCalcResultPage;

import net.thucydides.core.annotations.Step;

public class ATOSimpleTaxCalcSteps {

	ATOHomepage ATOHomePge;;
	SimpleTaxcalcPage taxCalPage;
	TaxCalcResultPage taxResPage;
	
	@Step
	public void verifyIfOnHomePage(){
		ATOHomePge.open();
		
	}
	
	

	@Step
	public void enterAllMandatoryFields(String incYr, String taxInc, String resStat, String mnthsOfres){
		taxCalPage.selectFinyear(incYr);
		taxCalPage.entertaxableIncome(taxInc);
		taxCalPage.selectResidencyStat(resStat);
		if(resStat.equalsIgnoreCase("Part-year resident")) {
			taxCalPage.selectMonthsOfResidency(mnthsOfres);
		}
		
	}
	
	@Step
	public void submitTheForm(){
		taxCalPage.submitForm();
		
	}
	
	@Step
	public void verifyCalculatedTax(String calcTax){
		taxResPage.verifyCalculatedTax(calcTax);
	}








	
	
}
