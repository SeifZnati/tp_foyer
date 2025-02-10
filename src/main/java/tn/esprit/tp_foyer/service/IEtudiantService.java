package tn.esprit.tp_foyer.service;

import tn.esprit.tp_foyer.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant>  retrieveAllEtudiants();
    Etudiant retrieveEtudiant (long etudiantId);
    Etudiant addEtudiant(Etudiant e);
    void removeEtudiant(long etudiantId);
    Etudiant modifyEtudiant(Etudiant etudiant);
}
