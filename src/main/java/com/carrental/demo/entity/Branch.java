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

/**
* Using @JoinColumn annotation will tell JPA that the EMPLOYEE table must have a foreign key column BRANCH_ID that
* references the BRANCH table's ID column.
*/
    @OneToMany
    @JoinColumn(name = "BRANCH_ID", referencedColumnName = "ID")
    private List<Employee> employees;
//
//    private List<Car> cars;

}
