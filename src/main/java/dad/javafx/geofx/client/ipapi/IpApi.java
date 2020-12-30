package dad.javafx.geofx.client.ipapi;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.client.ipify.Ipify;
import dad.javafx.geofx.client.ipify.IpifyException;
import dad.javafx.geofx.jackson.JacksonObjectMapper;

public class IpApi {
	
	public IpApi() {
		Unirest.setObjectMapper(new JacksonObjectMapper());
	}
	
	public Geo getGeoIpData(String ip) throws IpApiException {
		
		Geo geo = null;
		
		try {
			
			geo = Unirest
				.get("https://ipapi.com/ip_api.php?ip={ip}")
				.routeParam("ip", ip)
				.asObject(Geo.class)
				.getBody();
			
		} catch (UnirestException e) {

			throw new IpApiException(e);

		}
		
		return geo;

	}
	
	public static void main(String[] args) throws IpifyException, IpApiException {
		
		Ipify ipify = new Ipify();
		String ip = ipify.getIp();
		System.out.println("Your IP address: " + ip);
		
		IpApi ipapi = new IpApi();
		Geo geo = ipapi.getGeoIpData(ip);
		System.out.println("Your IP location: " + geo.getCountryName() + " (" + geo.getCountryCode() + ")");
		
	}

}
