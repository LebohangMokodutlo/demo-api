package com.testapi.demoapi.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true) // To include parent class fields in equals and hashCode methods
public class OurClientDTO extends BaseOurClientDTO {
    private String clientId;

    // No need for explicit getters and setters or constructors with Lombok's @Data.
}
