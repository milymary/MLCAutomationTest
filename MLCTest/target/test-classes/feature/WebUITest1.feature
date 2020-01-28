Feature: Automation Test - MLCInsurance

	Scenario: Test1- Check form validation for the Request a LifeView demo for MLCInsurance Lifeview 
	Given User is on the MLC Insurance homepage
	And Searches for "LifeView" on the Homepage 
	When verify for bread crumb content on LifeView Page
	Then User clicks on Request a Demo button
	And Form is filled with relevant mandatory content and not submitted
	
	|Name	   |EmailID			|Phone			|
	|DemoUser1 |demo@gmail.com	|+610456765456	|
	
	
Scenario Outline: Test2- To verify calculated tax for 3 combinations of assessment year, income and residency status 
	Given User is on the ATO Simple Tax Calculator Page as provided
	When All Mandatory fields <incomeYear>, <taxableIncome>, <residencyStatus>, <monthsOfResidency> are filled in the form and submitted
	Then Calculated tax <calculatedTaxExpected> is verified
	
Examples:	
	|incomeYear|   taxableIncome|    residencyStatus		 |monthsOfResidency |  calculatedTaxExpected|
	|2016-17   |      100000	|  Resident for full year	 |	NA				|	24632.00			|
	|2017-18   | 	  120000    |  Non-resident for full year|  NA				|   40485.00			|
	|2018-19   |      130000    |	Part-year resident		 |	6				|	36046.92			|	
	
	

Scenario Outline:Test3 -To calculate shipping costs for parcels of different weights to 3 countries using the Australia Post API
	Given User sends a GET Request to calculate shipping costs <expectedCost> for a parcel of weight <parcelWeightInKGs> to country <destinationcountrycode> and response is validated
	
	 Examples:
	  
	   	|expectedCost 	|parcelWeightInKGs|destinationcountrycode|
	    |24.40	   		|1.0 			  |NZ|
	    |82.90	   		|2.0			  |AF|
	   	|100.40	   		|3.0		      |AR|	
	