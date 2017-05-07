package org.projet.hopital.controllers;

import org.projet.hopital.entities.Dossier;
import org.projet.hopital.entities.Patient;
import org.projet.hopital.services.DossierService;
import org.projet.hopital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DossierController {

    @Autowired
    private DossierService dossierService;

    @Autowired
    private PatientService patientService;

    @RequestMapping(value = "/dossiers/list")
    public String index(Model model) {
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
        Dossier dossier = new Dossier();
        Patient patient = new Patient();
        dossier.setPatient(patient);
        model.addAttribute("dossier", dossier);
        return "dossiers/edit";
    }

    @RequestMapping(value = "/dossiers/edit", method = RequestMethod.POST)
    public String getDossier(@ModelAttribute("dossier") Dossier dossier) {
        patientService.savePatient(dossier.getPatient());
        dossierService.saveDossier(dossier);
        return "redirect:/dossiers/list";
    }
}
