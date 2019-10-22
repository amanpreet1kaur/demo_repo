package APIResource;

public class GoogleApiResource {
	public static String addplaceRsc;
	public  static String postGPlaceResource(String reqFormat) {
		if(reqFormat.equals("json")) {
			 addplaceRsc = "/maps/api/place/add/json/";
		}else {
			 addplaceRsc = "/maps/api/place/add/xml/";
		}
		return addplaceRsc;
		
	}
}
