package org.projet.hopital.controllers;

import org.projet.hopital.entities.Patient;
import org.projet.hopital.entities.RendezVous;
import org.projet.hopital.services.PatientService;
import org.projet.hopital.services.RendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RdvController {

    @Autowired
    private RendezVousService rdvService;

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/rdv/list")
    public String index(Model model) {

        Iterable<RendezVous> rendezvous = rdvService.getRendezVous();

        model.addAttribute("rendezvous", rendezvous);
        return "rdv/list";
    }

    @RequestMapping(value = "/rdv/{id}/edit")
    public String getDossier(Model model, @PathVariable(value = "id") Long id) {

        Iterable<Patient> patients = patientService.getPatients();
        RendezVous rendezvous = rdvService.getRendezVousById(id);

        model.addAttribute("rendezvous", rendezvous);
        model.addAttribute("patients", patients);
        return "rdv/edit";
    }

    @RequestMapping(value = "/rdv/new")
    public String getDossier(Model model) {

        Iterable<Patient> patients = patientService.getPatients();
        RendezVous rendezVous = new RendezVous();

        model.addAttribute("rendezvous", rendezVous);
        model.addAttribute("patients", patients);
        return "rdv/edit";
    }

    @RequestMapping(value = "/rdv/edit", method = RequestMethod.POST)
    public String getDossier(@ModelAttribute("rendezvous") RendezVous rendezvous) {

        rdvService.saveRendezVous(rendezvous);
        return "redirect:/rdv/list";
    }
}
