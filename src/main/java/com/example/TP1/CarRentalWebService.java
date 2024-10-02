package com.example.TP1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarRentalWebService {
    CarRepository carRepository;

    @Autowired
    public CarRentalWebService(CarRepository carRepository) {
        super();
        this.carRepository = carRepository;
    }

    public void addCar(Car car) {
        this.carRepository.save(car);
    }
}
