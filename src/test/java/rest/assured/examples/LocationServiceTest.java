package rest.assured.examples;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import rest.assured.examples.dto.LocationRequest;

public class LocationServiceTest {
	String API_KEY = "<API_KEY>";
	String LOCATION_SERVICE_URL = "https://discover.search.hereapi.com/v1/discover";
	
    @Test 
    public void getLocations_valid() {
    	LocationRequest locationRequest = getLocationRequest();
    	
    	Response response = RestAssured.given()
    			.queryParam("at", locationRequest.getAt())
    			.queryParam("q", locationRequest.getQuery())
    			.queryParam("apiKey", API_KEY)
    			.when().get(LOCATION_SERVICE_URL);
    	response.then().log().all();
    	
    	response.then().assertThat().statusCode(200);
    }
    
    //Move this to Util.java and read values from CSV file
    private LocationRequest getLocationRequest() {
    	return new LocationRequest("52.5228,13.4124","petrol+station","en-US");
    }
}
