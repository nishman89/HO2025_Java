package com.sparta.serenity;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.rest.SerenityRest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import io.restassured.response.Response;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class SimplePostcodeTest {
    private static Response response;

    @BeforeAll
    static void beforeAll() {
        response = SerenityRest
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
        assertThat(response.statusCode(), is(200));
    }
}