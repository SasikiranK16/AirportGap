package org.airport.tests;

import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import org.hamcrest.*;
import static org.hamcrest.MatcherAssert.*;

public class AirportG extends BaseAirport {

	@Test
	public void testName() throws Exception {
		datas();
		given().baseUri("https://airportgap.com/").log().all().contentType(ContentType.JSON)
				.headers("Authorization",properties.getProperty("value")).when().get("api/airports").then().assertThat()
				.statusCode(200).log().all();
	}
}
