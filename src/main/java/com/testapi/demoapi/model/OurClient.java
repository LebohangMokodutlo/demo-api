package com.testapi.demoapi.model;

import lombok.Data;

@Data
public class OurClient {
    private String clientId;

	public void setClientName(String clientName) {
		// TODO Auto-generated method stub
		
	}

	public void setClientAddress(String clientAddress) {
		// TODO Auto-generated method stub
		
	}

	public void setClientContacts(String clientContacts) {
		// TODO Auto-generated method stub
		
	}

	public String getClientName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getClientAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getClientContacts() {
		// TODO Auto-generated method stub
		return null;
	}

    // No need for explicit getters and setters or constructors with Lombok's @Data.
}
