//package com.sparta.restassured;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.hamcrest.MatcherAssert.*;
//import static org.hamcrest.Matchers.*;
//
//public class SingleOutcodeTest {
//
//    private static Response response;
//
//    @BeforeAll
//    public static void beforeAll() {
//        response = RestAssured
//                .given()
//                .baseUri("https://api.postcodes.io/")
//                .basePath("outcodes/")
//                .header("Accept", "application/json")
//                .when()
//                .log().all()
//                .get("EC2Y")
//                .thenReturn();
//    }
//
//    @Test
//    @DisplayName("Status code 200 returned")
//    public void testStatusCode200() {
//        assertThat(response.statusCode(), is(200));
//    }
//
//    @Test
//    @DisplayName("Server header is cloudflare")
//    public void testServerHeaderIsCloudflare() {
//        assertThat(response.header("Server"), is("cloudflare"));
//    }
//
//    @Test
//    @DisplayName("Correct outcode returned in response")
//    public void testCorrectOutcodeReturnedInResponse() {
//        assertThat(response.jsonPath().getString("result.outcode"), is("EC2Y"));
//    }
//
//    @Test
//    @DisplayName("Status code 200 returned - ALT")
//    void testStatusCode200_alt() {
//        RestAssured
//                .get("https://api.postcodes.io/outcodes/EC2Y")
//                .then()
//                .assertThat()
//                .statusCode(200);
//    }
//}
