package com.carrental.demo.controller;

import com.carrental.demo.entity.Car;
import com.carrental.demo.service._car.CarService;
import com.carrental.demo.service._car.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/cars")
public class CarController {

    private CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

//    @GetMapping
//    public List<Car> findAll() {return carService.findAll();}
}
