package com.carrental.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "rental")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int employee_id;
    private String comments;
    private Date dateOfReservation;

    private int reservation_id;


}
