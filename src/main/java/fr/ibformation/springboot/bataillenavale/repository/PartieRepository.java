package fr.ibformation.springboot.bataillenavale.repository;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.springboot.bataillenavale.gestionnairepartie.Partie;


public interface PartieRepository  extends CrudRepository<Partie, Long>{

}
