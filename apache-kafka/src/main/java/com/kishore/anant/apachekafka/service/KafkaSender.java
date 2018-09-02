/**
 * 
 */
package com.kishore.anant.apachekafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author i351596
 *
 */
@Service
public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	static final String kafkaTopic = "topic";
	
	public void send(String msg)
	{
		kafkaTemplate.send(kafkaTopic, msg);
	}

}
