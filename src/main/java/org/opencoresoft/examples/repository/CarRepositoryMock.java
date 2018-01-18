package org.opencoresoft.examples.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.opencoresoft.examples.domain.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepositoryMock implements CarRepository {
	private List<Car> carsList = new ArrayList<>();
	
	{
		carsList.add(new Car("Toyota", "Camry", 2011));
		carsList.add(new Car("Nissan", "Altima", 2015));
		carsList.add(new Car("Honda", "Accord", 2013));
		carsList.add(new Car("Hyundai", "Santa Fe", 2018));
	}

	@Override
	public List<Car> findAll() {
		return Collections.unmodifiableList(carsList);
	}

}
