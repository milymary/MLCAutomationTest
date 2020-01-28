package com.mlc.cucumber.serenity;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;

import com.mlc.utils.ReusableSpecifications;

import io.restassured.RestAssured;
import net.thucydides.core.annotations.Step;

public class AusPostAPISteps {

	
		@Step
		public void requestValidationForAusPostAPI(String expectedCost, String wghtInKG, String countryCode) {
			RestAssured.baseURI="https://digitalapi.auspost.com.au/postage/parcel/international/calculate.json";
			
			System.out.println("argexpectedCost" +  expectedCost );
			System.out.println("wghtInKG" + wghtInKG );

			System.out.println("countryCode" + countryCode );
			
			String CC=countryCode;
			String wght=wghtInKG;
			String cost=expectedCost;
			
			RestAssured.given().headers("AUTH-KEY","5bb3b769-c32c-4085-bd94-e9106cd9d1e8")
			.when().formParam("country_code", CC).formParam("weight", wght).formParam("service_code", "INT_PARCEL_STD_OWN_PACKAGING")
			.get()
			.then()
			.log()
			.all()
			.statusCode(200).spec(ReusableSpecifications.getGenericResponseSpec(expectedCost));
			
			
			
			
	}
	
	
}
