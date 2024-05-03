package com.jsp.SpringBootCar.CarDAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.SpringBootCar.CarDTO.Car;
import com.jsp.SpringBootCar.CarRepository.CarRepository;

@Repository
public class CarDao {

	@Autowired
	CarRepository carRepository;
	
	
	public String insert(Car car) {
	carRepository.save(car);
		return "Item is added";
	}
	
	public List<Car> findall(){
		return carRepository.findAll();
		
	}
	
	public Car find(int id) {
		Optional<Car> opt = carRepository.findById(id);
		
		if(opt.isPresent()) {
			return opt.get();
			
		}
		return null;
		
	}
}
