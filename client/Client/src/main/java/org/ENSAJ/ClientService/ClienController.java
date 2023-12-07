package org.ENSAJ.ClientService;

import java.util.List;

import org.ENSAJ.ClientService.model.Client;
import org.ENSAJ.ClientService.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienController {
	
	@Autowired
	ClientRepository clientRepository;
	
	
	

	@GetMapping("/clients")
	public List<Client> chercherClients() {
	
		return clientRepository.findAll();
	}
	
	@GetMapping("/client/{id}")
	public Client chercherUnclient(@PathVariable Long id) throws Exception{
		return this.clientRepository.findById(id).orElseThrow(()-> new Exception("Client Inexistant"));
	}
	
}
