package com.example.api_project.controller;
import com.example.api_project.model.Car; 
import com.example.api_project.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getCars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/getCarByName/{name}")
    public Car getCarByName(@PathVariable String name) {
        return carService.getCarByName(name);
    }
    @PostMapping("/addCar")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        Car newCar = carService.addCar(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }
}
