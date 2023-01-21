package com.example.testsamedi3.services;


import com.example.testsamedi3.entities.Classe;
import com.example.testsamedi3.entities.Utilisateur;
import com.example.testsamedi3.repository.ClasseRepository;
import com.example.testsamedi3.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

@Service
public class ImpUtilisateur implements IUtilisateurService{

    UtilisateurRepository utilisateurRepository;
    ClasseRepository classeRepository;


    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void affecterUtilisateurClasse(Integer idUtilisateur, Integer codeClasse) {
        Utilisateur utilisateur = utilisateurRepository.findById(idUtilisateur).orElse(null);
        Classe classe = classeRepository.findById(codeClasse).orElse(null);
        utilisateur.setClasse(classe);
        utilisateurRepository.save(utilisateur);



    }


}
