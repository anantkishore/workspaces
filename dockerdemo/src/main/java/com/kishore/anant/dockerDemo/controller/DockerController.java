/**
 * 
 */
package com.kishore.anant.dockerDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anant Kishore
 *
 */
@RestController
public class DockerController {

	@GetMapping("/name")
	public String getAppName() {
		
		return "Spring Boot Docker Container Demo Application1";
	}

}
