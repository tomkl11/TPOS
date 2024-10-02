package com.example.TP1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(CarRentalWebService carRentalService) {
		return (args) -> {
			Car car = new Car("11AA22", "Ferrari", 1000);
			carRentalService.addCar(car);
			car = new Car("22BB44", "Porshe", 2000);
			carRentalService.addCar(car);
		};
	};

}
