/**
 * 
 */
package com.in28minutes.springboot.microservice.example.currencyconversion.springbootmicroservicecurrencyconversion;

import java.math.BigDecimal;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.microservice.example.currencyconversion.CurrencyExchangeServiceProxy;

/**
 * @author i351596
 *
 */
@RestController
public class CurrencyConversionController {
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CurrencyExchangeServiceProxy proxy;

	/**
	 * 
	 */
	public CurrencyConversionController() {
	}
	
	@RequestMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		
	    
	    CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);
	    
	    logger.info("{", response);
	    
	    return new CurrencyConversionBean(response.getId() , response.getFrom(), response.getTo(), response.getConversionMultiple(), quantity, quantity.multiply(response.getConversionMultiple()), response.getPort());
		
	}

}
