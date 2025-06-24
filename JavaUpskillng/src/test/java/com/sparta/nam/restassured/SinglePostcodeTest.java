package com.sparta.nam.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SinglePostcodeTest {


        private static Response response;

        @BeforeAll
        static void beforeAll() {
            response = RestAssured
                    .given()
                    .baseUri("https://api.postcodes.io")
                    .basePath("/postcodes")
                    .header("Accept", "text/json")
                    .when()
                    .get("/EC2Y5AS")
                    .thenReturn();
        }

    @Test
    @DisplayName("Status code 200 returned")
    void testStatusCode200() {
        MatcherAssert.assertThat(response.statusCode(), Matchers.is(200));
    }

    @Test
    @DisplayName("The server name in the headers is cloudflare")
    void testServerNameInHeadersIsCloudflare() {
        MatcherAssert.assertThat(response.header("Server"), Matchers.is("cloudflare"));
    }

    @Test
    @DisplayName("Correct postcode returned in response")
    void testCorrectPostcodeReturnedInResponse() {
        MatcherAssert.assertThat(
                response.jsonPath().getString("result.postcode"),
                Matchers.is("EC2Y 5AS"));
    }
}
