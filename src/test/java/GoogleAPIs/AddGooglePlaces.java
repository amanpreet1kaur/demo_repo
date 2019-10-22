package GoogleAPIs;

import static APIpayloads.GoogleAPIPayloads.addGooglePlacepPayLoad;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import APIResource.GoogleApiResource;
import Utility.CommonFuncs;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AddGooglePlaces extends BaseTest {
	
	@BeforeMethod
	public void setUp() {
		RestAssured.baseURI=prop.getProperty("baseURI");
	}
	
	@Test
	public void postGooglePlace() {
		
		Response  response =  given().
			queryParam("key",prop.getProperty("googleApiKey")).
			body(addGooglePlacepPayLoad()).
		when().
			post(GoogleApiResource.postGPlaceResource("json")).
		then().
			assertThat().statusCode(200).extract().response();
			System.out.println(response);
			
			JsonPath jpath = CommonFuncs.rawToJSON(response);
			String placeId = jpath.get("place_id");
			System.out.println(placeId);
			
	}
	
	
	
	
	
	
}
