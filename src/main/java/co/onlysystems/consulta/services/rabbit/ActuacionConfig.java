package co.onlysystems.consulta.services.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Clase que contiene la definicion de los beans para el ejemplo de HelloWorld de integración de RabbitMQ con Spring
 * AMQP
 * 
 *
 */
//@Profile({ "tut1", "hello-world" })
@Configuration
public class ActuacionConfig {

    /**
     * Creamos una cola con nombre hello
     * 
     * @return Cola de mensajes
     */
    @Bean
    public Queue actuaciones() {
	return new Queue("prueba");
    }

    /**
     * Creamos un receptor de mensajes
     * 
     * @return Receptor de mensajes
     */
   

    /**
     * Creamos un enviador de mensajes
     * 
     * @return Enviador de mensajes
     */
 //   @Profile("sender")
    @Bean
    public ActuacionesSender sender() {
	return new ActuacionesSender();
    }

}