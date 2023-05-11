package com.carrental.demo.service._car;

import com.carrental.demo.entity.Car;
import com.carrental.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl {

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public List<Car> findAll() {
        return carRepository.findAll();
    }


    public Car findById(int id) {
        Optional<Car> result = carRepository.findById(id);
        Car car = null;
        if(result.isPresent()) {
            car=result.get();
        }
        else {
            throw new RuntimeException("Did not found car id - " + id);
        }
        return car;
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public void deleteById (int id) {
        carRepository.deleteById(id);
    }

}
