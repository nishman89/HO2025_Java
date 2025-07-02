package com.sparta.serenity.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;
import static org.hamcrest.Matchers.equalTo;

public class OutcodeLookupSteps {
    @When("I look up the outcode {string}")
    public void iLookUpTheOutcode(String outcode) {
        when().get(outcode);

    }

    @And("the returned outcode should be {string}")
    public void theReturnedOutcodeShouldBe(String expected) {
        then().body("result.outcode", equalTo(expected));

    }
}
