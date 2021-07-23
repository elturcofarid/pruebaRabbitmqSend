package com.util.message.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.util.message.queue.model.dto.EmailBody;
import com.util.message.queue.services.rabbit.MessageSender;

@RestController
public class MessageController {

	@Autowired
	private MessageSender sender;

	@RequestMapping(value = "send", method = RequestMethod.POST)
	public void ejecutar(@RequestBody EmailBody emailBody) {
		sender.send(emailBody);
	}
}
