package activities;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class GitProject {
    // Declare request specification
	RequestSpecification requestSpec;
    // Declare response specification
    ResponseSpecification responseSpec;
    String SSHKey;
    int id;
    
    @BeforeClass
    public void setup() {
    	   requestSpec = new RequestSpecBuilder()
                // Set content type
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Bearer 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")
                // Set base URL
                .setBaseUri("https://api.github.com")
                // Build request specification
                .build();
    	   SSHKey="ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDFmEtYn2il2gNNCXh/gPNn++dOEQd4hQy7iNSNGKIJ8FXoSDZSgM6o2Q0UzkZ7DMrpboB5+bWIfMsuSnrCkI1NoIso0AV1I6Y1wH1D9W8vPXSAegsVRmEAfplgLzjRHy1QSsuRwQ3HM58wrXS40IbqdtpJPq5hLnQflfviRhMDLNozEoclgX5XrsJ5r5BEG+dQ3KntA7CWLEQw6gkCmMeU89saB2NrGwnzohLKpTbztL1mhiqRvjD4SsFCciObM0zF9vMFu/H3FzAJeX51drC9HiTSiIXHTwmewtBfRXhQFch+x4hw/fozHZRCc1GuT0PGDqeeojU0w+qggrwk4qEV";
    }
    
//    @Test
//    public void getmail() {
//    	Response response= given().spec(requestSpec)
//    			.when().get("/user/emails");
//    	String resbody =response.getBody().asPrettyString();
//   	 System.out.println(resbody);
//   	response.then().statusCode(200);
//    }
    @Test(priority=1)
    public void addKey() {
    	String reqBody= "{\"title\":\"TestKey\",\"key\":\""+SSHKey+ "\"}";
    	 Response response = given().spec(requestSpec) // Use requestSpec
                 .body(reqBody) // Send request body
                 .when().post("/user/keys"); // Send POST request
    	
    	 String resbody =response.getBody().asPrettyString();
    	 System.out.println(resbody);
    	 id=response.then().extract().path("id");
    	 response.then().statusCode(201);
    }
    @Test(priority=2)
    public void getKey() {
    	Response response= given().spec(requestSpec)
    			.when().get("/user/keys");
    	String resbody =response.getBody().asPrettyString();
   	 System.out.println(resbody);
   	response.then().statusCode(200);
    }
    @Test(priority=3)
    public void delKey() {
    	Response response= given().spec(requestSpec)
    			.pathParam("keyId",id).when().delete("/user/keys/{keyId}");
    	String resbody =response.getBody().asPrettyString();
      	 System.out.println(resbody);
      	response.then().statusCode(204);
    	
    }
    
}

