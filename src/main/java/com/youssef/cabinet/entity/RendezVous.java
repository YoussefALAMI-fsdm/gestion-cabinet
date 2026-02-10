package com.youssef.cabinet.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRDV")
    private long id ;

    @Column(nullable = false)
    private LocalDateTime date ;

    private TypeConsultation typeConsultation;

    @ManyToOne
    @JoinColumn(name = "idPatient")
    private Patient patient ;

    @ManyToOne
    @JoinColumn( name = "idMedecin")
    private Medecin medecin ;

    @OneToOne(mappedBy = "rendezVous")
    private Facture facture;
}
