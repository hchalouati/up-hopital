package org.projet.hopital.services;

import org.projet.hopital.entities.Patient;

public interface PatientService {

    public Iterable<Patient> getPatients();

    public Patient getPatientById(Long id);

    public void savePatient(Patient patient);


}
