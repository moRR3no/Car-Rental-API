package com.carrental.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "branch")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    private String address;

//    @OneToMany
//    private List<Employee> employees;
//
//    private List<Car> cars;

}
