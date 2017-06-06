package fr.ibformation.springboot.bataillenavale.repository;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.springboot.bataillenavale.gestionnairepartie.Joueur;

public interface JoueurRepository extends CrudRepository<Joueur, Long> {
	public Joueur findByName(String nomJoueur);
	
}
