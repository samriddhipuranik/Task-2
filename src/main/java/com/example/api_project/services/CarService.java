package com.example.api_project.services;
import com.example.api_project.model.Car;
import com.example.api_project.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarByName(String name) {
        return carRepository.findByName(name);
    }
    
    public Car addCar(Car car) {
        return carRepository.save(car);
    }
}
