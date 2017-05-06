package org.projet.hopital.services.impl;

import org.projet.hopital.entities.Dossier;
import org.projet.hopital.repositories.DossierRepository;
import org.projet.hopital.services.DossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hani.chalouati on 06/05/2017.
 */
@Service
public class DossierServiceImpl implements DossierService {

    @Autowired
    private DossierRepository dossierRepository;

    @Override
    public Iterable<Dossier> getDossiers() {
        return dossierRepository.findAll();
    }

    @Override
    public Dossier getDossierById(Long id) {
        return dossierRepository.findOne(id);
    }

    @Override
    public void saveDossier(Dossier dossier) {
        dossierRepository.save(dossier);
    }
}
