package com.example.mintic.Box.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mintic.Box.model.Reservation;
import com.example.mintic.Box.repository.RepositoryReservation;

@Service
public class ServiceReservation {
    
    @Autowired
    private RepositoryReservation repositoryReservation;

    
    public List<Reservation> getAll() {
        return repositoryReservation.getAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return repositoryReservation.getReservation(id);
    }

    public Reservation save(Reservation reservation) {
        if (reservation.getIdReservation() == null) {
            return repositoryReservation.save(reservation);
        } else {
            Optional<Reservation> reservation1 = repositoryReservation.getReservation(reservation.getIdReservation());
            if (reservation1.isEmpty()) {
                return repositoryReservation.save(reservation);
            } else {
                return reservation;
            }
        }
    }
}
