package tn.esprit.tp_foyer.service;

import tn.esprit.tp_foyer.entity.Chambre;
import tn.esprit.tp_foyer.entity.TypeChambre;

import java.util.List;

public interface IChambreService {

    List<Chambre>  retrieveAllChambres();
    Chambre retrieveChambre(long chambreId);
    Chambre addChambre(Chambre c);
    void removeChambre(long chambreId);
    Chambre modifyChambre(Chambre chambre);
    List<Chambre> trouverChambresByType(TypeChambre tch);
    Chambre trouverChambrebyNum(long num);
}
