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
public class CoursClassroom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer idCours;
    @Enumerated(EnumType.STRING)
    Specialite specialite;

    Integer nbHeures;

    Boolean archive;

    @ManyToOne
    Classe classe;





}
