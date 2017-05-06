package org.projet.hopital.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {


    private String prenom;
    private String nom;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matricule;
    private Long nsecu;


    public Employee(String prenom, String nom, Long nsecu) {
        super();
        this.prenom = prenom;
        this.nom = nom;
        this.nsecu = nsecu;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getMatricule() {
        return matricule;
    }

    public void setMatricule(Long matricule) {
        this.matricule = matricule;
    }

    public Long getNsecu() {
        return nsecu;
    }

    public void setNsecu(Long nsecu) {
        this.nsecu = nsecu;
    }


}
