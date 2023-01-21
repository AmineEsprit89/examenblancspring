package com.example.testsamedi3.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCategorieProduit;

    String prenom;

    String nom;

    String password;

    @ManyToOne
    Classe classe;




}
