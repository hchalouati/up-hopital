package org.projet.hopital.repositories;

import org.projet.hopital.entities.Patient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hani.chalouati on 06/05/2017.
 */
public interface PatientRepository extends CrudRepository<Patient, Long> {
}
