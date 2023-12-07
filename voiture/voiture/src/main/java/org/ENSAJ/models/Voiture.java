package org.ENSAJ.models;

import org.ENSAJ.Client;

import jakarta.persistence.*;
import lombok.ToString;

@ToString
@Entity
public class Voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String matricule;
	
	@Column
	private String marque;
	
	
	@Column
	private String model;

	
	
	@Transient
	    private Client client;
	    private Long clientId;
	    

	
	


	public Voiture(String matricule, String marque, String model, Long clientId) {
			super();
			this.matricule = matricule;
			this.marque = marque;
			this.model = model;
			this.clientId = clientId;
			
		}




	public Client getClient() {
			return client;
		}




		public void setClient(Client client) {
			this.client = client;
		}




		public Long getClientId() {
			return clientId;
		}




		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}




	public Voiture() {
		
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
}
