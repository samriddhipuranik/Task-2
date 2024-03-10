package com.example.api_project.repository;
import com.example.api_project.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByName(String name);
}

