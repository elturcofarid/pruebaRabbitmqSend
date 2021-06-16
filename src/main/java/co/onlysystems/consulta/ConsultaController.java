package co.onlysystems.consulta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import co.onlysystems.consulta.services.rabbit.ActuacionesSender;

@RestController
public class ConsultaController {

	@Autowired
	private RestTemplate restTemplate;

	

	@Autowired
	private ActuacionesSender sender;

		

	@GetMapping(value = "/ejecutar")
	//@Scheduled(fixedDelay = 1000, initialDelay = 500)
	public void ejecutar() {

				
					sender.send("hola");
	
	}

	
}
