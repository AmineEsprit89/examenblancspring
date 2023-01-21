package com.example.testsamedi3.controller;


import com.example.testsamedi3.entities.Classe;
import com.example.testsamedi3.entities.Utilisateur;
import com.example.testsamedi3.services.IClasseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClasseController {
    IClasseService classeService;

    @PostMapping("/ajouterclasse")
    @ResponseBody
    Classe ajouterClasse(@RequestBody Classe c) {
        return classeService.ajouterClasse(c);
    }







}
