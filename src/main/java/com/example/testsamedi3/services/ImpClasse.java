package com.example.testsamedi3.services;


import com.example.testsamedi3.entities.Classe;
import com.example.testsamedi3.repository.ClasseRepository;
import org.springframework.stereotype.Service;

@Service
public class ImpClasse implements IClasseService{
    ClasseRepository classeRepository;
    @Override
    public Classe ajouterClasse(Classe c) {
        return classeRepository.save(c);
    }
}
