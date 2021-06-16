package co.onlysystems.consulta.services.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

/**
 * Clase que envia mensaje a la cola con el contenido de HelloWorld
 * 
 * @author hfuentepe
 *
 */
public class ActuacionesSender {

    /**
     * Template que proporciona Spring para trabajar con RabbitMQ
     */
    @Autowired
    private RabbitTemplate template;

    /**
     * Establecemos la cola a la que envíamos los mensajes
     */
    @Autowired
    private Queue queue;
    
    @Autowired
    private Gson gson;

    /**
     * Metodo que realiza envios a la cola
     */
//    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send(String message) {
    //	public void send(Actuacion actuacion) {
	//String message = "Hello World!";    
	
	this.template.convertAndSend(queue.getName(), gson.toJson(message));
	System.out.println(" Enviado mensaje:" + message + " a la cola: " + queue.getName());
    }

}
