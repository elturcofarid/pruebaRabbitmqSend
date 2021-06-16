package co.onlysystems.consulta.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigJuzgado {

	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
}
