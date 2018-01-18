package org.opencoresoft.examples.controller;

import java.util.List;

import org.opencoresoft.examples.domain.Car;
import org.opencoresoft.examples.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	@Autowired
	private CarRepository carRepository;
	
	@GetMapping("/cars") 
	public List<Car> getCarList() {
		return carRepository.findAll();
	}

}
