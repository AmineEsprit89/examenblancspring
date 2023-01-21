package com.example.testsamedi3.services;

import com.example.testsamedi3.entities.Utilisateur;

public interface IUtilisateurService {


    public Utilisateur ajouterUtilisateur (Utilisateur utilisateur);

    public void affecterUtilisateurClasse (Integer idUtilisateur, Integer codeClasse);

}
