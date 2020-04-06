
  package com.kubernete.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
  public class DemoController {
  
  @GetMapping("/demoGKE") 
  public String demoGKE() { return
  "Roona says hello Kubernetes"; } 
  @GetMapping("/") 
  public String demoGKE1() { return
  "Roona says hello Kubernetes welcome page"; } 
  
}
 