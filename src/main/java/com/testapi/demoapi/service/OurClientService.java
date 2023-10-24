package com.testapi.demoapi.service;

import java.util.List;
import java.util.Optional;

import com.testapi.demoapi.dto.OurClientDTO;
import com.testapi.demoapi.model.OurClient;

public interface OurClientService {
    Optional<OurClient> getClientById(String clientId);

    String deleteClient(String clientId);

	List<OurClient> getClients();

	OurClient createClient(OurClient newClient);

	OurClient updateClient(String clientId, OurClient updatedClient);
}
