package org.projet.hopital.repositories;

import org.projet.hopital.entities.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
