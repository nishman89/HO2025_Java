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
//public class SinglePostcodeTest {
//
//    private static Response response;
//    @BeforeAll
//    public static void beforeAll(){
//        response = RestAssured
//                .given()
//                .baseUri("https://api.postcodes.io/")
//                .basePath("postcodes/")
//                .header("Accept", "text/json")
//                .when()
//                .log().all() // info about the request
//                .post("EC2Y5AS")
//                .thenReturn();
//    }
//
//    @Test
//    @DisplayName("Status code 200 returned")
//    public void testStatusCode200(){
//        assertThat(response.statusCode(), is(200));
//    }
//
//    @Test
//    @DisplayName("The server name in the headers in cloudflare")
//    public void testServerNameInHeadersIsCloudFlare(){
//        assertThat(response.header("Server"), is("cloudflare"));
//    }
//
//    @Test
//    @DisplayName("Correct postcode returned in response")
//    public void testCorrectPostcodeReturnedInResponse(){
//        assertThat(response.jsonPath().getString("result.postcode"), is("EC2Y 5AS"));
//    }
//
//
//    @Test
//    @DisplayName("Status code 200 returned - ALT")
//    void testStatusCode200_alt() {
//        RestAssured
//                .get("https://api.postcodes.io/postcodes/EC2Y5AS")
//                .then()
//                .assertThat()
//                .statusCode(200);
//    }
//}
