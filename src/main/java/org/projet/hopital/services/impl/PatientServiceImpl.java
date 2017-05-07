package org.projet.hopital.services.impl;

import org.projet.hopital.entities.Patient;
import org.projet.hopital.repositories.PatientRepository;
import org.projet.hopital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Iterable<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findOne(id);
    }

    @Override
    public void savePatient(Patient patient) {
        patientRepository.save(patient);
    }
}
