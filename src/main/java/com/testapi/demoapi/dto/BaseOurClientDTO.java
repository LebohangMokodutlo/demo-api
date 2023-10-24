package com.testapi.demoapi.dto;

import lombok.Data;

@Data
public abstract class BaseOurClientDTO {
    private String clientName;
    private String clientAddress;
    private String clientContacts;

    // You can add common fields, methods, or validations for DTOs here (excluding ID).
}
