package com.example.testsamedi3.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Classe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer codeClasse;

    String titre;

    @Enumerated(EnumType.STRING)
    Niveau niveau;

    @OneToMany(mappedBy = "classe")
    Set<CoursClassroom> coursClassrooms;



}
