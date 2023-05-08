package com.carrental.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "return")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Return {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int employee_id;
    private Date date;

    private int extraCharge;
    private String comments;
}
