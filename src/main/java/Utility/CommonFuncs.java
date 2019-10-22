package Utility;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CommonFuncs {
	public static JsonPath rawToJSON(Response response) {
		String res = response.asString();
		JsonPath jp =new JsonPath(res);
		return jp;
	}
}
