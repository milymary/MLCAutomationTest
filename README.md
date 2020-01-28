#MLC test automation project includes 3 assignment tests :
1. Automation scenarios around Record a demo for Lifeview on teh MLC Insurance Page. https://www.mlcinsurance.com.au/
2. Tax calculations on the ATO page https://www.ato.gov.au/Calculators-and-tools/Host/?anchor=STC&amp;anchor=STC#STC/questions
3. Australia Post API to calculate shipping costs for parcels of different weights to at least three countries.


Built With:
	•	Serenity BDD
	•	Maven
	•	Cucumber
	•	Selenium Web driver
	•	Page Object pattern
	•	Java
	•	Re-usable Request Specification methods
	•	Serenity reports
	•	Cucumber data tables and data driven testing using Examples

Requirements:
	In order to utilise this project you need to have the following installed locally:
	•	Maven (maven-3.6.1 is used )
	•	Chrome and Chromedriver (UI tests use Chrome by default, can be changed in serenity.properties file)
	•	Java 1.8(1.7 or above)


Steps to Run the code from local:	
Access the project folder from your console/terminal and give the following commands:
	mvn clean verify serenity:aggregate
	
Reporting:
	Reports for each module are written into their respective /target directories after a successful run.
	Serenity reports get generated once a successful build run has been completed.
	These can be accessed from the MLCTest/target/site/serenity/index.html 

	
Authors:
Mily Mary Chacko

License:
This project is created under a public repository on my personal GIT account.

Acknowledgments:
For the detailed explanation on how to incorporate individual knowledge into the framework designed- Serenity Framework: http://www.thucydides.info/#/


