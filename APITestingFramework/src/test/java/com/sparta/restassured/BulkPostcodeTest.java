package com.sparta.restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BulkPostcodeTest {
    private static Response response;

    @BeforeAll
    public static void beforeAll() {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("postcodes", new String[]{"EC2Y 5AS", "W1A 1AA", "M32 0JG"});

        response = RestAssured
                .given()
                .baseUri("https://api.postcodes.io")
                .basePath("/postcodes")
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .log().all()
                .post()
                .thenReturn();
    }

    @Test
    @DisplayName("Status code 200 returned")
    public void testStatusCode200() {
        assertThat(response.statusCode(), is(200));
    }

    @Test
    @DisplayName("Response contains all requested postcodes")
    public void testAllPostcodesPresent() {
        assertThat(response.jsonPath().getList("result").size(), is(3));
    }

    @Test
    @DisplayName("First postcode in response is EC2Y 5AS")
    public void testFirstPostcodeReturned() {
        assertThat(response.jsonPath().getString("result[0].result.postcode"), is("EC2Y 5AS"));
    }

    @Test
    @DisplayName("Server header is cloudflare")
    public void testServerHeader() {
        assertThat(response.header("Server"), is("cloudflare"));
    }
}
