package com.kishore.anant.apachekafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kishore.anant.apachekafka.producer.Sender;

@SpringBootApplication
public class ApacheKafkaApplication implements CommandLineRunner {
	
	@Autowired
	private Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sender.send("Spring Kafka Producer and Consumer Example");
	}
}
