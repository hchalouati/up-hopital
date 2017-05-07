package org.projet.hopital.services;

import org.projet.hopital.entities.Dossier;

public interface DossierService {

    Iterable<Dossier> getDossiers();

    Dossier getDossierById(Long id);

    void saveDossier(Dossier dossier);
}
