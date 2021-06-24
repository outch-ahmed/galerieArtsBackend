package fr.aston.sqli.projet.canadagalerie;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class CanadaGalerieApplication {

	private static final Logger LOG = LogManager.getLogger();
	
	public static void main(String[] args) {
		CanadaGalerieApplication.LOG.info("##### Starting Museum project with spring security ####");
		SpringApplication.run(CanadaGalerieApplication.class, args);
	}

}
