package org.projet.hopital.services;

import org.projet.hopital.entities.Dossier;

/**
 * Created by hani.chalouati on 06/05/2017.
 */
public interface DossierService {

    Iterable<Dossier> getDossiers();

    Dossier getDossierById(Long id);

    void saveDossier(Dossier dossier);
}
