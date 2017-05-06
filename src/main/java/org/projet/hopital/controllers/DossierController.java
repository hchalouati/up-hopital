package org.projet.hopital.controllers;

import org.projet.hopital.entities.Dossier;
import org.projet.hopital.entities.Patient;
import org.projet.hopital.services.DossierService;
import org.projet.hopital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Created by hani.chalouati on 06/05/2017.
 */
@Controller
public class DossierController {

    @Autowired
    private DossierService dossierService;

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/dossiers/list")
    public String index(Model model, HttpServletRequest request) {

        Iterable<Dossier> dossiers = dossierService.getDossiers();

        model.addAttribute("dossiers", dossiers);
        return "dossiers/list";
    }

    @RequestMapping(value = "/dossiers/{id}/edit")
    public String getDossier(Model model, @PathVariable(value = "id") Long id) {

        Iterable<Patient> patients = patientService.getPatients();
        Dossier dossier = dossierService.getDossierById(id);

        model.addAttribute("dossier", dossier);
        model.addAttribute("patients", patients);
        return "dossiers/edit";
    }

    @RequestMapping(value = "/dossiers/new")
    public String getDossier(Model model) {

        Iterable<Patient> patients = patientService.getPatients();
        Dossier dossier = new Dossier();

        model.addAttribute("dossier", dossier);
        model.addAttribute("patients", patients);
        return "dossiers/edit";
    }

    @RequestMapping(value = "/dossiers/edit", method = RequestMethod.POST)
    public String getDossier(@ModelAttribute("dossier") Dossier dossier) {

        dossierService.saveDossier(dossier);
        return "redirect:/dossiers/list";
    }
}
