package com.youssef.cabinet.entity;

import jakarta.persistence.*;

@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @OneToOne(fetch = FetchType.EAGER)
    private RendezVous rendezVous ;

    private EtatPaiment etatPaiment ;
}
