package com.example.testsamedi3.controller;


import com.example.testsamedi3.entities.CoursClassroom;
import com.example.testsamedi3.services.ICoursClassroomService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursClassroomController {

    ICoursClassroomService coursClassroomService;

    @PostMapping("/ajouterCoursClassroom")
    @ResponseBody
    CoursClassroom ajouterCoursClassroom(@RequestBody CoursClassroom cc, @RequestBody Integer codeClasse) {
        return coursClassroomService.ajouterCoursClassroom(cc,codeClasse);
    }


}
