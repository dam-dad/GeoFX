package dad.javafx.geofx.client.ipify;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.jackson.JacksonObjectMapper;

public class IpifyService {
	
	public IpifyService() {
		Unirest.setObjectMapper(new JacksonObjectMapper());
	}
	
	public String getIp() throws IpifyServiceException {
		
		try {
			
			Ip response = 
				Unirest
					.get("https://api.ipify.org")
					.queryString("format", "json")
					.asObject(Ip.class)
					.getBody();
			
			return response.getIp();

		} catch (UnirestException e) {
			
			throw new IpifyServiceException(e);
			
		}
		
	}
	
	public static void main(String[] args) throws IpifyServiceException {
		IpifyService service = new IpifyService();
		System.out.println(service.getIp());
	}

}
