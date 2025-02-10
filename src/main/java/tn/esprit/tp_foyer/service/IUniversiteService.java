package tn.esprit.tp_foyer.service;

import tn.esprit.tp_foyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite>  retrieveAllUniversites();
    Universite retrieveUniversite(long univsersiteId);
    Universite addUniversite(Universite u);
    void removeUniversite(long universiteId);
    Universite modifyUniversite(Universite universite);
}
