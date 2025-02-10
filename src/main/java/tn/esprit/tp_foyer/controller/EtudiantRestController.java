package tn.esprit.tp_foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.entity.Etudiant;
import tn.esprit.tp_foyer.service.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {

    IEtudiantService etudiantService;

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(Long etId) {
        return etudiantService.retrieveEtudiant(etId);
    }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(Long etId) {
        etudiantService.removeEtudiant(etId);
    }

    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(Etudiant e) {
        return etudiantService.modifyEtudiant(e);
    }


}
