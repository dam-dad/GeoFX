package dad.javafx.geofx.client.ipapi;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.jackson.JacksonObjectMapper;

public class IpApiService {
	
	public IpApiService() {
		Unirest.setObjectMapper(new JacksonObjectMapper());
	}
	
	public Geo getGeoIpData(String ip) throws UnirestException {
		
		// http://api.ipapi.com/85.155.136.162?access_key=c07d02779cdfba18a83cb77f12fc290c&format=1
		
		Geo geo  = 
			Unirest
				.get("https://ipapi.com/ip_api.php?ip={ip}")
				.routeParam("ip", ip)
				.asObject(Geo.class)
				.getBody();
		
		return geo;

	}
	
	public static void main(String[] args) throws UnirestException {
		IpApiService service = new IpApiService();
		Geo geo = service.getGeoIpData("85.155.136.162");
		System.out.println(geo.getCountryName() + " (" + geo.getCountryCode() + ")");
	}

}
