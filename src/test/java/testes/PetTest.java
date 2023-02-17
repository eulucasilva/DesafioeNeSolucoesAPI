package testes;

import core.BaseTest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class PetTest extends BaseTest {

    private int id = 5;

    @Test
    public void addPet(){

        Map<String, Object> pet = new HashMap<>();
        pet.put("name", "Teddy");
        pet.put("status", "Sold");

        given().
            log().all()
                .body(pet)
                .when().
                    post("/pet")
                .then()
                    .log().all()
                    .statusCode(200)
                    .contentType(APP_CONTENT_TYPE)
                    .body("id", is(notNullValue()))
                    .body("name", is("Teddy") )
                    .body("status", is("Sold"));
    }

    @Test
    public void getPet(){
        given()
                .log().all()
                .when()
                    .get("/pet/" + id)
                .then();
    }

    @Test
    public void getPetByStatus(){
        given()
                .log().all()
                .queryParam("status", "available", "sold")
                .when()
                    .get("/pet/findByStatus")
                .then()
                    .statusCode(200)
                    .body("id", is(notNullValue()))
                    .body("name", is(notNullValue()) )
                    .body("status", is(notNullValue()));
    }


    @Test
    public void deletePet(){
        given()
                .log().all()
                .when()
                    .delete("/pet/" + id)
                .then()
                    .log().all()
                    .statusCode(200);
    }

    @Test
    public void updatePet(){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", 1);
        params.put("name", "Pitbull");
        params.put("status", "pending");
        given()
                .log().all()
                .body(params)
                .when()
                    .put("/pet")
                .then()
                    .log().all()
                    .statusCode(200)
                    .body("id", is(notNullValue()))
                    .body("name", is("Pitbull") )
                    .body("status", is("pending"));
    }

}
