package com.example.testsamedi3.services;

import com.example.testsamedi3.entities.CoursClassroom;
import org.springframework.stereotype.Service;


@Service
public interface ICoursClassroomService {
    public CoursClassroom ajouterCoursClassroom (CoursClassroom cc, Integer codeClasse);

}
