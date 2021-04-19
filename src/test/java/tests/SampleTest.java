package tests;

import org.testng.annotations.Test;

import utils.Utility;

public class SampleTest 
{
	Utility utils = new Utility();
	@Test
	public void test()
	{
		utils.GET_Method("https://demoqa.com/utilities/weather/city/Hyderabad");
		utils.validateStatusCode(200);
		System.out.println("Demo------------------------------");
		
	}

}
