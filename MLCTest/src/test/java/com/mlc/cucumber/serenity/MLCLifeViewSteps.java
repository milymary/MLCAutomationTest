package com.mlc.cucumber.serenity;

import com.mlc.pages.MLCHomePage;
import com.mlc.pages.MLCLifeViewPage;
import com.mlc.pages.MLCReqADemoPage;

import net.thucydides.core.annotations.Step;



public class MLCLifeViewSteps {
	
	MLCHomePage MLChomep;
	MLCLifeViewPage MLClview;
	MLCReqADemoPage MLCReqDemo;

	
	@Step
	public void verifyIfOnHomePage() throws Exception {
		MLChomep.open();
		MLChomep.onhomePage();
		
	}
	
	@Step
	public void searchUsingToggleSearch(String stringSearch)  {
		MLChomep.traverseToToggleSearchbutton();
		MLChomep.typeSearch(stringSearch);
		MLChomep.selectTyped(stringSearch);
		
	}

	@Step
	public void verifyBreadCrumbsContentOnLifeViewPage() {
		System.out.println("in");
		MLClview.verifyBreadCrumbContent();
	}
	
	@Step
	public void clickOnRequestADemo() {
		MLClview.traverseToReqToDemoBtn();
	}
	 

	@Step
	public void fillReqADemoForm(String userName, String userEmail, String userPhn) {
		MLCReqDemo.fillUpName(userName);
		MLCReqDemo.emailID(userEmail);
		MLCReqDemo.phnnuM(userPhn);
		
		
	}

}
