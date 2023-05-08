package com.carrental.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "income")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int totalIncome;
}
