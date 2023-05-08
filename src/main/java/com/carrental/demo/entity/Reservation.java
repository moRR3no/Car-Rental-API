package com.carrental.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "reservation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date firstDayOfReservation;
    private Date lastDayOfReservation;

    private int reservationBranch_id;

    private int returnBranch_id;

    private int price;
}
