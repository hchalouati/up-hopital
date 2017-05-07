package org.projet.hopital.repositories;

import org.projet.hopital.entities.Dossier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierRepository extends CrudRepository<Dossier, Long> {
}
