package org.projet.hopital.services.impl;

import org.projet.hopital.entities.RendezVous;
import org.projet.hopital.repositories.RendezVousRepository;
import org.projet.hopital.services.RendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RendezVousServiceImpl implements RendezVousService {

    @Autowired
    private RendezVousRepository rendezVousRepository;

    @Override
    public Iterable<RendezVous> getRendezVous() {
        return rendezVousRepository.findAll();
    }

    @Override
    public RendezVous getRendezVousById(Long id) {
        return rendezVousRepository.findOne(id);
    }

    @Override
    public void saveRendezVous(RendezVous rendezVous) {
        rendezVousRepository.save(rendezVous);
    }
}
