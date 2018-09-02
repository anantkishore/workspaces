/**
 * 
 */
package com.kishore.anant.apachekafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kishore.anant.apachekafka.service.KafkaSender;

/**
 * @author i351596
 *
 */
@RestController
public class ApacheKafkaController {

	@Autowired
	private KafkaSender kafkaSender;
	
	@GetMapping(value = "producer/{message}")
	private String producer(@PathVariable("message") String message)
	{
		kafkaSender.send(message);
		
		return message;
	}
}
