package com.gcp.kubernete;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KuberneteController {
	@GetMapping("/hello")
	public String helloKubernete() {
		return "Roona Says hello kubernetes";
	}

}
