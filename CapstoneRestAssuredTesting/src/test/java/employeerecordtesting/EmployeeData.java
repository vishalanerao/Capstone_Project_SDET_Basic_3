package employeerecordtesting;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class EmployeeData {

//	@Test
	public void getAllEmployeeData() {

		RestAssured.baseURI = "http://dummy.restapiexample.com";
		given().log().all().when().get("/api/v1/employees").then().log().all();

	}
	
//	@Test
	public void getSingleEmployeeData() {
		
	 RestAssured.baseURI = "http://dummy.restapiexample.com";
	 given().header("Content-Type","application/json").log().all()
	 .when().get("/api/v1/employee/17").then().log().all();
	} 
	
//	@Test
	public void createNewRecord() {
		RestAssured.baseURI = "http://dummy.restapiexample.com";
		given()
		.header("Content-Type","application/json")
		.body("{\r\n" + 
				"    \"name\": \"Suraj Puri\",\r\n" + 
				"    \"salary\": \"76500\",\r\n" + 
				"    \"age\": \"32\"\r\n" + 
				"}").log().all()
		.when().post("/api/v1/create")
		.then().log().all()
		.assertThat().statusCode(200);
	}
	
//	@Test
	public void UpdateAnEmployeeRecord(){
		RestAssured.baseURI = "http://dummy.restapiexample.com";
		given()
		.contentType(ContentType.JSON)
		.body("{\r\n" + 
				"    \"name\": \"Tata Harrior\",\r\n" + 
				"    \"salary\": \"52000\",\r\n" + 
				"    \"age\": \"26\"\r\n" + 
				"}")
		.log().all()
		.when().put("/api/v1/update/2")
		.then().log().all();
	}
	@Test
	public void deleteAnEmployeeRecord() {
		RestAssured.baseURI = "http://dummy.restapiexample.com";
		given()
		.contentType(ContentType.JSON).log().all()
		.when().delete("/api/v1/delete/12")
		.then().log().all();
	}
	
}
