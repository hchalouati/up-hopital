package org.projet.hopital.services;

import org.projet.hopital.entities.RendezVous;

public interface RendezVousService {

    Iterable<RendezVous> getRendezVous();

    RendezVous getRendezVousById(Long id);

    void saveRendezVous(RendezVous dossier);
}
