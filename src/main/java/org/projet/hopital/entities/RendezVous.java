package org.projet.hopital.entities;

import javax.persistence.*;

@Entity
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    private String dateRdv;
    private String heure;
    @OneToOne(fetch = FetchType.EAGER)
    private Patient patient;

    public RendezVous() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDateRdv() {
        return dateRdv;
    }

    public void setDateRdv(String dateRdv) {
        this.dateRdv = dateRdv;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public void RechercherRdv() {

    }

    public void AjouterRdv() {

    }

    public int ModifierRdv() {

        return 0;
    }

    public void SupprimerRdv() {

    }

}
