package org.opencoresoft.examples.repository;

import java.util.List;

import org.opencoresoft.examples.domain.Car;

public interface CarRepository {
	public List<Car> findAll();
}
