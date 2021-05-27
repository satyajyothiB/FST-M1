package restAssuredExample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import io.restassured.specification.ResponseSpecification;

public class apiActivity{
	  // Declare request specification
    RequestSpecification requestSpec;
    // Declare response specification
//    ResponseSpecification responseSpec;
    String accessKey;
    String sshKey="ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC7OAGKYyoptA4ixfccnexJlDyNBNyJqVxhpioA2RZKExisSQ+T1uN8IqGQilxCrn7LJ4qH4BL4tgnyswitlWHdJZpqIPO21HXr62nRy2UyFz08JrcPTYd9U15DwfJ5G0nyDWmdSO7ARlKcNpF10tfgkYoMgQNMy32zjSKcE1yQEYeqouQv/pItuHtevJQHduVfjokN54/Ky3HHojKZoFORLRa24aBHuECggB1pKR8LdAiQudPJWmn7Vk9+LGA+oHodYKg/i/atbADR0+cdVrd/ctsCCZpY1FgPSBma+XXuOkXV4MZiDILpZLGHYunMzyupA2E2blp1fDFPXnrVt399";
	String id;
  @BeforeClass
  public void setup() {
	  accessKey ="Bearer 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";
	  
	  requestSpec = new RequestSpecBuilder()
			  .setContentType(ContentType.JSON)
			  .addHeader("Authorization", accessKey)
			  .setBaseUri("https://api.github.com")
			  .build();
	  
  }
  
  @Test( priority=1)
  public void getemail() {
	  Response response = given().spec(requestSpec)
			  .when().get("/user/emails");
	  
	  String responseBody = response.asPrettyString();
	  
	  System.out.println(responseBody);
	  
	  response.then().statusCode(200);
  }


@Test(priority=2)
public void postkeys() {
	String reqBody = " {\"title\":\"TestKey\", \"key\":\"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC7OAGKYyoptA4ixfccnexJlDyNBNyJqVxhpioA2RZKExisSQ+T1uN8IqGQilxCrn7LJ4qH4BL4tgnyswitlWHdJZpqIPO21HXr62nRy2UyFz08JrcPTYd9U15DwfJ5G0nyDWmdSO7ARlKcNpF10tfgkYoMgQNMy32zjSKcE1yQEYeqouQv/pItuHtevJQHduVfjokN54/Ky3HHojKZoFORLRa24aBHuECggB1pKR8LdAiQudPJWmn7Vk9+LGA+oHodYKg/i/atbADR0+cdVrd/ctsCCZpY1FgPSBma+XXuOkXV4MZiDILpZLGHYunMzyupA2E2blp1fDFPXnrVt399\",\"read_only\":true}";
	
	System.out.println(reqBody);
	
	
	Response response1 = given().spec(requestSpec)
			            .body(reqBody)
			            .when().post("/user/keys");
	
	String responseBody1 =response1.asPrettyString();
	
	 id =response1.path("id").toString();
	
	System.out.println(id);
	
	System.out.println(responseBody1);
	
	//Assertions
	
	response1.then().statusCode(201);
	
}

@Test(priority=3)
public void deletekeys() {
	Response  response2 = given().spec(requestSpec)
			         .pathParam("keyId", id)
			        .when().delete("user/keys/{keyId}");
	
	response2.then().statusCode(204);
			
}
}
