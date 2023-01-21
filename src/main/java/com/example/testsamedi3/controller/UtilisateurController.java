package com.example.testsamedi3.controller;

import com.example.testsamedi3.entities.Utilisateur;
import com.example.testsamedi3.services.IUtilisateurService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {

    IUtilisateurService utilisateurService;


    @PostMapping("/ajouterutilisateur")
    @ResponseBody
    Utilisateur ajouterUtilisateur(@RequestBody Utilisateur u) {
        return utilisateurService.ajouterUtilisateur(u);
    }

    @PostMapping("/affecterUtilisateurClasse")
    @ResponseBody
    void affecterUtilisateurClasse(@RequestBody Integer idUtilisateur,@RequestBody Integer codeClasse) {
        utilisateurService.affecterUtilisateurClasse(idUtilisateur,codeClasse);
    }



}
