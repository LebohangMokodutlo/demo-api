package com.testapi.demoapi.repository;

import com.testapi.demoapi.model.OurClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OurClientRepository extends JpaRepository<OurClient, String> {

	OurClient findByClientName(String clientName);
    // Define custom query methods if needed
}
