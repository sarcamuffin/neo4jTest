package com.example.neo4jTest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor

public class Offre {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Recruteur", nullable = false)
    private String recruteur;

    @Column(name="Nom", nullable = false)
    private String Nom;

    @Column(name="Domaine", nullable = false)
    private String domaine;

    @Column(name="Description")
    private String description;


    public Offre() {

    }
}
