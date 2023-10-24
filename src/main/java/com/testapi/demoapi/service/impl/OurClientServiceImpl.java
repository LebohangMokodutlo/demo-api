package com.testapi.demoapi.service.impl;

import com.testapi.demoapi.model.OurClient;
import com.testapi.demoapi.repository.OurClientRepository;
import com.testapi.demoapi.service.OurClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OurClientServiceImpl implements OurClientService {

    private final OurClientRepository ourclientRepository;

    @Autowired
    public OurClientServiceImpl(OurClientRepository clientRepository) {
        this.ourclientRepository = clientRepository;
    }

    @Override
    public List<OurClient> getClients() {
        List<OurClient> clients = new ArrayList<>();
        ourclientRepository.findAll().forEach(clients::add);
        return clients;
    }

    @Override
    public Optional<OurClient> getClientById(String clientId) {
		return Optional.of(ourclientRepository.findById(clientId).get());
    }

    @Override
    public OurClient createClient(OurClient newClient) {
        String clientName = newClient.getClientName();
        OurClient existingClient = ourclientRepository.findByClientName(clientName);
        if (existingClient != null) {
            throw new IllegalArgumentException("Client with the same name already exists.");
        }
        // Generate the clientId by replacing spaces with underscores in clientName
        String clientId = clientName.replaceAll("\\s+", "_");
        newClient.setClientId(clientId);
        return ourclientRepository.save(newClient);
    }

    @Override
    public OurClient updateClient(String clientId, OurClient updatedClient) {
        Optional<OurClient> existingClient = ourclientRepository.findById(clientId);

        if (!existingClient.isPresent()) {
            throw new IllegalArgumentException("Client not found");
        }

        existingClient.get().setClientName(updatedClient.getClientName());

        return ourclientRepository.save(existingClient.get());
    }

    @Override
    public String deleteClient(String clientId) {
        Optional<OurClient> existingClient = ourclientRepository.findById(clientId);

        if (!existingClient.isPresent()) {
            return "Client not found";
        }

        try {
        	ourclientRepository.delete(existingClient.get());
            return "Client deleted successfully";
        } catch (Exception e) {
            return "Could not delete client";
        }
	}
}
