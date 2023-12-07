package org.ENSAJ;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.ENSAJ.clients.ClientRest;
import org.ENSAJ.models.Voiture;
import org.ENSAJ.repositories.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients

@SpringBootApplication
public class VoitureApplication {
	private VoitureRepository voitureRepository;
	private ClientRest clientRest;

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}




	@Bean
	CommandLineRunner initialiserDataBase(VoitureRepository voitureRepository,ClientRest clientRest){
		return args -> {
			clientRest.allClient().forEach(c ->{
				String matricule = genererChaineAleatoire();
				String marque = getRandomMarque();
	            String model = getRandomModel();
				voitureRepository.save(new Voiture(matricule, marque, model,c.getId()));
			});

		};
	}

	private String getRandomMarque() {
        List<String> marques = Arrays.asList( "Ferrari","BMW", "Mercedes", "Audi");
        return marques.get(new Random().nextInt(marques.size()));
    }

    private String getRandomModel() {
        List<String> modeles = Arrays.asList("A1","A2","A5");
        return modeles.get(new Random().nextInt(modeles.size()));
    }

    private String genererChaineAleatoire() {
        String caracteresPermis = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int indexAleatoire = random.nextInt(caracteresPermis.length());
            char caractereAleatoire = caracteresPermis.charAt(indexAleatoire);
            sb.append(caractereAleatoire);
        }

        return sb.toString();
    }


}