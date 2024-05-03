package com.jsp.SpringBootCar.CarController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringBootCar.CarDAO.CarDao;
import com.jsp.SpringBootCar.CarDTO.Car;

@RestController
public class CarController {
	
	@Autowired
	CarDao carDao;
	
	@PostMapping("/car")
	public String insertItem(Car car) {
		
		String mess = carDao.insert(car);
		return mess;
	}
	
	@GetMapping("/car")
	public List<Car> findAll(){
		
		return carDao.findall();
	}
	
	@GetMapping("/carId")
	public Car find(@RequestParam int id) {
		
		return carDao.find(id);
	}

}
