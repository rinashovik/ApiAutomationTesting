
//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests {

    @Test
    public void getUsers(){

//        Response response = RestAssured.get(" https://reqres.in/api/users?page=2\n");
        Response response = get(" https://reqres.in/api/users?page=2\n");

        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("contentType :" + response.contentType());
        System.out.println("Body: " + response.getBody().toString());
        System.out.println("Body: " + response.getBody().asString());
        System.out.println("Header : " + response.getHeaders());
        System.out.println("Header : " + response.getHeaders().exist());
        System.out.println("Header : " + response.getHeaders().size());
        System.out.println("Time Taken : " + response.time());
        System.out.println("Time Taken : " + response.time());

        /*verification

         */

        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(response.contentType(),"application/json; charset=utf-8");

        }


        @Test
        public void getSingleUser(){

            given()
                .get("https://reqres.in/api/users/2")
                    .then()
                    .statusCode(200);




        }


    }
