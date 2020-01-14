import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class SimpleAPICall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://maps.googleapis.com";
		given().
				param("location","-33.8670522,151.1957362").
				param("radiaus",1500).
				param("key","AIzaSyDcTv-GoJz-pFf9I-KSkSylWMJ3C2B4lzo").
				when().
				get("/maps/api/place/nearbysearch/json").
				then().assertThat().statusCode(200);
				//header
				//cookie
				//body
				

	}

}
