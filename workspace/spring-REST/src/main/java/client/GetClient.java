package client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class GetClient {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();

		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl("http://localhost:8080/spring-REST/")
				.path("find").queryParam("id", 201);

		ResponseEntity<String> resp = template
				.getForEntity(builder.toUriString(), String.class);

		System.out.println(resp.getBody());
	}

}
