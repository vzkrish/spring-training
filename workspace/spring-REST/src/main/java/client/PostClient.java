package client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.demo.spring.Emp;

public class PostClient {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();

		Emp e = new Emp(211, "Neetha", "Pune", 54000);
		
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Emp> data = new HttpEntity<Emp>(e,headers);

		ResponseEntity<String> resp = 
				template.exchange("http://localhost:8080/spring-REST/save", 
						HttpMethod.POST, data,	String.class);

		System.out.println(resp.getBody());
	}

}
