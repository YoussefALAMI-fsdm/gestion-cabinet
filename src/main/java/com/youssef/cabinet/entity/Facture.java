package com.youssef.cabinet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idRDV")
    private RendezVous rendezVous ;

    private EtatPaiment etatPaiment ;
}
