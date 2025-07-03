package com.sparta.serenity.steps;

import com.sparta.serenity.pojos.PostcodeResponse;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class PostcodeLookupSteps {

    @When("I look up the postcode {string}")
    public void iLookUpThePostcode(String postcode) {
        when().get(postcode);
    }

    @And("the returned postcode should be {string}")
    public void theReturnedPostcodeShouldBe(String expected) {

        PostcodeResponse response = lastResponse().as(PostcodeResponse.class);
        assertThat(response.getResult().getPostcode(), equalTo(expected));
        then().body("result.postcode", equalTo(expected));
    }

    @And("the region should be {string}")
    public void theRegionShouldBe(String expected) {
        PostcodeResponse response = lastResponse().as(PostcodeResponse.class);
        assertThat(response.getResult().getRegion(), equalTo(expected));
        then().body("result.region",equalTo(expected));
    }


    @And("the postcode should match the UK format")
    public void thePostcodeShouldMatchTheUKFormat() {
        String postcode = then().extract().path("result.postcode");
        String postcodeRegex = "^[A-Z]{1,2}[0-9]{1,2}[A-Z]?(\\s*[0-9][A-Z]{1,2})?$";
        assertThat(postcode.matches(postcodeRegex), is(true));
    }
}
