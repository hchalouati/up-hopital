package org.projet.hopital.repositories;

import org.projet.hopital.entities.Dossier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hani.chalouati on 06/05/2017.
 */
@Repository
public interface DossierRepository extends CrudRepository<Dossier, Long> {
}
