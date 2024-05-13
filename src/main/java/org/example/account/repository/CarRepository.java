package org.example.account.repository;

import org.example.account.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  CarRepository extends JpaRepository<Car,Long>
{

    Car getCarById(Long id);
    List<Car> findAllByMark(String mark);
    List<Car> findAllByModel(String model);
    List<Car> findAllByYear(String year);
}
