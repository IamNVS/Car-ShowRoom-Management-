package com.jsp.SpringBootCar.CarRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringBootCar.CarDTO.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
