/**
 * 
 */
package com.kishore.anant.apachekafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author i351596
 *
 */
@Component
public class MyKafkaListener {

	@KafkaListener(topics = "topic")
	public void processMessage( String content) {
		System.out.println(content);
	}
	
}
