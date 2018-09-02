/**
 * 
 */
package com.kishore.anant.apachekafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author i351596
 *
 */
@Service
public class Sender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Value("${app.topic.foo}")
	private String topic;
	
	public void send(String message) 
	{
		System.out.println("Sending message: " + message);
		kafkaTemplate.send(topic, message);
	}
}
