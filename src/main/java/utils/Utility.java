package utils;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Utility 
{
	Response response;
	
	public Response GET_Method(String URL)
	{
		response = RestAssured.get(URL);
		response.prettyPrint();
		return response;
	}
	
	public void validateStatusCode(int statusCode)
	{
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
