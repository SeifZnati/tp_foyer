package tn.esprit.tp_foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.entity.Universite;
import tn.esprit.tp_foyer.service.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {

    IUniversiteService universiteService;

    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(Long uId) {
        return universiteService.retrieveUniversite(uId);
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(Universite u) {
        return universiteService.addUniversite(u);
    }

    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(Long uId) {
        universiteService.removeUniversite(uId);
    }

    @PutMapping("/modify-universite")
    public Universite modifyUniversite(Universite u) {
        return universiteService.modifyUniversite(u);
    }
}
