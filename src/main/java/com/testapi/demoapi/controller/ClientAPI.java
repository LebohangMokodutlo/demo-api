package com.testapi.demoapi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testapi.demoapi.model.OurClient;

@RestController
@RequestMapping("/ourclient")
public class ClientAPI {
	OurClient ourClient;
	
	
	@GetMapping("{ClientId}")
	public OurClient getClientDetails(String ClientId)
	{
		return ourClient;
		 // new Client("C1","Lebohang","Pretoria","078 563 1133");
	}
	
	@PostMapping
	public String createOurClientDetails(@RequestBody OurClient ourClient) 
	{
		this.ourClient = ourClient;
		return "Client created successfully";
	}
	
	@PutMapping
	public String UpdateOurClientDetails(@RequestBody OurClient ourClient) 
	{
		this.ourClient = ourClient;
		return "Client Updated successfully";
	}
	
	@DeleteMapping("{ClientId}")
	public String DeleteOurClientDetails(String ClientId) 
	{
		this.ourClient = null;
		return "Client Deleted successfully";
	}

}
