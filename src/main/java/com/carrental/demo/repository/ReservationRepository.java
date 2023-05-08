package com.carrental.demo.repository;

import com.carrental.demo.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository <Reservation, Integer> {
}
