package demo.web;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 * send message to /queue/vehicles
*/

@RestController
public class WebSocketApi {

	@MessageMapping("/sendMessage")
	@SendTo("/queue/vehicles")
	public String sendMessage(String message) throws Exception {
		return message;
	}
}
