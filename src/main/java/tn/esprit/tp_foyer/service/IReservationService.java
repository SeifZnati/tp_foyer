package tn.esprit.tp_foyer.service;

import tn.esprit.tp_foyer.entity.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation>  retrieveAllReservations();
    Reservation retrieveReservation(long reservationId);
    Reservation addReservation(Reservation r);
    void removeReservation(long reservationId);
    Reservation modifyReservation(Reservation reservation);
}
