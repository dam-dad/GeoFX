package dad.javafx.geofx.client.ipify;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.jackson.JacksonObjectMapper;

public class Ipify {
	
	public Ipify() {
		Unirest.setObjectMapper(new JacksonObjectMapper());
	}
	
	public String getIp() throws IpifyException {
		
		try {
			
			Ip response = 
				Unirest
					.get("https://api.ipify.org")
					.queryString("format", "json")
					.asObject(Ip.class)
					.getBody();
			
			return response.getIp();

		} catch (UnirestException e) {
			
			throw new IpifyException(e);
			
		}
		
	}
	
	public static void main(String[] args) throws IpifyException {
		Ipify service = new Ipify();
		System.out.println(service.getIp());
	}

}
