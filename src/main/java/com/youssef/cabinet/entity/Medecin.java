package com.youssef.cabinet.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "Medecins",
        uniqueConstraints = @UniqueConstraint(columnNames = "{emailMedecin}"))
public class Medecin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedecin")
    private long id ;

    @Column(name = "emailMedecin",nullable = false)
    private String email ;

    @Column(name = "nomMedecin")
    private String nom ;

    @Column(name = "prenomMedecin")
    private String prenom ;

    @Enumerated(EnumType.STRING) // Stocke le nom exact dans la base
    @Column(nullable = false)
    private SpecialiteMedecin specialite ;

    @OneToMany(mappedBy = "medecin", fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous ;
}
