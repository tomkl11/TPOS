package com.example.TP1;


import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/cars")
public class CarRentalService {
    private static ArrayList<Car> cars = new ArrayList<>();
    @GetMapping("/")
    public String displayCars() {
        cars.add(new Car("11AA22", "Ferrari", 100));
        String display = "";
        for (Car car : cars) {
            display += car + "\n";
        }
        return display;
    }
    @GetMapping ("/{plateNumber}")
    @ResponseBody
    public String displayCar(@PathVariable("plateNumber") String plateNumber) {
        Car car = aCar(plateNumber);
        if (car != null) {
            return car.toString();
        }
        return "there are no car with this numberplate";
    }

    public CarRentalService() {
        cars.add(new Car("11AA22", "Ferrari", 100));
    }

    public Car aCar(String plateNumber) {
        for (Car car : cars) {
            if (Objects.equals(car.getPlateNumber(), plateNumber)) {
                return car;
            }
        }
        return null;
    }
    @PutMapping(value = "/{plateNumber}")
    @GetMapping("/{plateNumber}")
    public String rentOrGetBack(@PathVariable String plateNumber,
                                @RequestParam(value = "rent", required = true) boolean rent) {
        Car car = aCar(plateNumber);
        if (car == null) {
            return "Car not found";
        }
        if (rent) {
            Date dateBegin = new Date(2017, Calendar.NOVEMBER, 11);
            Date dateEnd = new Date(2018, Calendar.JANUARY, 1);
            car.setDateBegin(dateBegin);
            car.setDateEnd(dateEnd);
            return "Car rented successfully";
        } else {
            car.setRent(false);
            car.setDateBegin(null);
            car.setDateEnd(null);
            return "Car returned successfully";
        }
    }
}
