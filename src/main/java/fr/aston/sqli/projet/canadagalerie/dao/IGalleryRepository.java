package fr.aston.sqli.projet.canadagalerie.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fr.aston.sqli.projet.canadagalerie.models.nosql.Gallery;

@Repository
public interface IGalleryRepository extends MongoRepository<Gallery, Integer>{
	
	public Optional<List<Gallery>> findByTitre(String titre);

}
