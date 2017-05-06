package org.projet.hopital.entities;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by hani.chalouati on 06/05/2017.
 */
@Entity
@Data
public class Dossier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @CreatedDate
    private LocalDateTime creationDate;

    @OneToOne(fetch = FetchType.EAGER)
    private Patient patient;


}
