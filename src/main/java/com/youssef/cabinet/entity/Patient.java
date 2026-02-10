package com.youssef.cabinet.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // La class doit avoir obligatoirement un NoArgsConstructor + Id
@Table(
        name="Patients",
       uniqueConstraints = @UniqueConstraint(columnNames = {"emailPatient"})
        )
public class Patient {

    @Id
    @Column(name="IdPatient")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // La DB est configurer pour faire l'auto-incrimentation
    private long id ;

    @Column(name = "nomPatient", nullable = false)
    private String nom ;

    @Column(name = "prenomPatient", nullable = false)
    private String prenom ;

    @Column(name = "emailPatient", nullable = false)
    private String email ;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous ;
}
