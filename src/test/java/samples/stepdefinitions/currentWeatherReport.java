package samples.stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import samples.templates.MergeFrom;
import samples.utils.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class currentWeatherReport extends Assert {

	/**
     * This Class can be written in a way to be reused to implement all API's of Weather Information API.
     */

   @Steps
    ApiRequest createRequest;

  

    @Steps
    EnvConfig envConfig;

    String baseURI, basePath, createBookRequestBody;


    @Before
    public void init() {
        baseURI = envConfig.getApiProperty(Constants.API_WEATHER);
        basePath = envConfig.getApiProperty(Constants.API_CURRENT_WEATHER);
        RestAssured.useRelaxedHTTPSValidation();
    }

    /**
     * Method to construct Request Body w.r.t Data provided in feature file.
     * TBD: Need to Enhance for multiple datasets.
     */
    @Given("the URI for Current Weather Report")
   

    @When("Current Weather API-URI is hit")
    public void i_create_the_book_record() {
    	createRequest.withDetails(baseURI,
                basePath,"",
                envConfig.appendHeaders());
    }


    @Then("Api should Return Statuscode <{int}>")
    public void apiShouldReturnStatuscode(int statusCode) {
        assertStatusCode(statusCode);
    }


    @Override
    public void assertResponseBody(Response response) {
        
    }

    @After
    public void cleanup() {
        RestAssured.reset();
    }


}
