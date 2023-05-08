package com.carrental.demo.repository;

import com.carrental.demo.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository <Rental, Integer> {
}
