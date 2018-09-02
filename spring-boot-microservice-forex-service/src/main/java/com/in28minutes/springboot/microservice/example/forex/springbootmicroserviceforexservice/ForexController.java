/**
 * 
 */
package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author i351596
 *
 */
@RestController
public class ForexController {

	/**
	 * 
	 */
	public ForexController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private Environment env;

	@Autowired
	private ExchangeValueRepository repo;

	@RequestMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

		ExchangeValue ev = repo.findByFromAndTo(from, to);

		ev.setPort(Integer.parseInt(env.getProperty("local.server.port")));

		return ev;
	}

}
