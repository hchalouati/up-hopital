package org.projet.hopital.services;

import org.projet.hopital.entities.Patient;

/**
 * Created by hani.chalouati on 06/05/2017.
 */
public interface PatientService {

    public Iterable<Patient> getPatients();

    public Patient getPatientById(Long id);

    public void savePatient(Patient patient);


}
