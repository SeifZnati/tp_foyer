package tn.esprit.tp_foyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.entity.Reservation;
import tn.esprit.tp_foyer.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    IReservationService reservationService;

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        return reservationService.retrieveAllReservations();
    }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long rId ) {
        return reservationService.retrieveReservation(rId);
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(Reservation r) {
        return reservationService.addReservation(r);
    }

    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") Long rId) {
        reservationService.removeReservation(rId);
    }

    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(Reservation r) {
        return reservationService.modifyReservation(r);
    }
}
