/**
 * 
 */
package com.kishore.anant.apachekafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * @author i351596
 *
 */
@Service
public class Receiver {

	@KafkaListener(topics = "${app.topic.foo}")
	public void listen(@Payload String message) {
		System.out.println("Received Message: "+ message);
	}
}
