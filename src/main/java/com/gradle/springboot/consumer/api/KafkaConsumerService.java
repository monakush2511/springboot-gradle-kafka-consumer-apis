package com.gradle.springboot.consumer.api;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
	  @KafkaListener(topics="kafkatopic3",
	  containerFactory="kafkaListenerContainerFactory", groupId="string_group")
	  public void stringConsume(String message) {
	  System.out.println("String message consumed!!" +message);
	  } 
	  
	  @KafkaListener(topics="kafkatopic4",containerFactory="jsonKafkaListenerContainerFactory", groupId="json_group")
	  public void jsonConsume(User user) { 
		  System.out.println("Json message consumed!!" +user);
	  }
	 
	  
	 
	
}
