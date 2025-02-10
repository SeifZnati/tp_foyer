package tn.esprit.tp_foyer.service;

import tn.esprit.tp_foyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer>  retrieveAllFoyers();
    Foyer retrieveFoyer(long foyerId);
    Foyer addFoyer(Foyer f);
    void removeFoyer(long foyerId);
    Foyer modifyFoyer(Foyer foyer);
}
