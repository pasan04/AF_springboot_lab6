package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Message;

@RestController 
@RequestMapping (value = "/messages")
public class MessageController {
	
	@RequestMapping (value = "/messages",method=RequestMethod.POST)
	public Message addMessage(@RequestBody Message massage) {
		
		return null;
		
	}
	
	@RequestMapping (value = "/{id}",method=RequestMethod.GET)
	public Message getMessage(@PathVariable("id") String id) {
		
		return null;
		
	}
	
	@RequestMapping (value = "/{id}",method=RequestMethod.PUT)
	public Message updateMessage(@PathVariable("id") String id,Message message) {
		
		return null;
		
	}
	
	@RequestMapping (value = "/{id}",method=RequestMethod.DELETE)
	public Message delMessage(@PathVariable("id") String id) {
		
		return null;
		
	}
	
	
	

}
