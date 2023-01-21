package com.example.testsamedi3.services;

import com.example.testsamedi3.entities.Classe;
import com.example.testsamedi3.entities.CoursClassroom;
import com.example.testsamedi3.repository.ClasseRepository;
import com.example.testsamedi3.repository.CoursClassroomRepository;

public class ImpCoursClassroomService implements ICoursClassroomService{

    ClasseRepository classeRepository;

    CoursClassroomRepository coursClassroomRepository;


    @Override
    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer codeClasse) {
        Classe classe = classeRepository.findById(codeClasse).orElse(null);
        cc.setClasse(classe);
        return coursClassroomRepository.save(cc);
    }



}
