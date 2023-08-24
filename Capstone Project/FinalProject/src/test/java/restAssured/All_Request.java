package restAssured;

import java.util.HashMap;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class All_Request extends TestBase {
	HashMap<String, String> map = new HashMap<String, String>();

	@Test(priority = 1)
	public void getProducts() {
		RestAssured.when().get("http://localhost:9010/get-shoes").then().assertThat().statusCode(200);
		logger.info("Reterived Products");
	}

	@Test(priority = 2)
	public void getUsers() {
		RestAssured.when().get("http://localhost:9010/get-users").then().assertThat().statusCode(200);
		logger.info("Reterived Users");
	}

	@Test(priority = 3)
	public void addProduct() {
		RestAssured.given().contentType("application/json").body(map).when().post(
				"http://localhost:9010/add-shoe?id=101&image=image_url&name=SampleShoe&category=Running&sizes=9&price=1000")
				.then().statusCode(200).log().all();
		logger.info("Added Product");
	}

}
