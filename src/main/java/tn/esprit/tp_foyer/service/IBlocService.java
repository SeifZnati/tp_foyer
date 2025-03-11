package tn.esprit.tp_foyer.service;

import tn.esprit.tp_foyer.entity.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc>  retrieveAllBlocs();
    Bloc retrieveBloc(long blocId);
    Bloc addBloc(Bloc b);
    void removeBloc(long blocId);
    Bloc modifyBloc(Bloc bloc);
    void assignFoyerToBloc(Long foyerId, Long blocId);
    void desassignFoyerToBloc(Long foyerId, Long blocId);
    }
