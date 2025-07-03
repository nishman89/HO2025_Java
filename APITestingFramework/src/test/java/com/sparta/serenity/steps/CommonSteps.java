package com.sparta.serenity.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

import static net.thucydides.model.environment.SystemEnvironmentVariables.createEnvironmentVariables;

public class CommonSteps {


    @Given("I am using the postcodes API with the end point {string}")
    public void iAmUsingThePostcodesAPIWithTheEndPoint(String endpoint) {
        given().baseUri(createEnvironmentVariables().getProperty("postcode.api.url") + endpoint);
        // given().baseUri("https://api.postcodes.io/postcodes/");
    }
    @Then("I should get a {int} response code")
    public void iShouldGetAResponseCode(int code) {
        then().statusCode(code);
    }


}
