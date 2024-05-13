package org.example.account.service;

import lombok.RequiredArgsConstructor;
import org.example.account.model.Car;
import org.example.account.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository carRepository;

    public Car CreateCar(Car car) {
        return carRepository.save(car);
    }

    public Car DeleteCar(Long id) {
        Car car = carRepository.getCarById(id);
        carRepository.delete(car);
        return car;
    }

    public Car UpdateCar(Long id,Car car) {

        Car car1 = carRepository.getCarById(id);
        car.setId(id);
        Car car2 = carRepository.save(car);
        return car2;


    }

    public Car getCar(long id) {
    Car car1=carRepository.getCarById(id);
    return car1;
    }

    public List<Car> searchmark(Car car) {
        List<Car> foundCarsMark = carRepository.findAllByMark(car.getMark());
        return foundCarsMark;
    }
    public List<Car> searchmodel(Car car) {
        List<Car> foundCarsModel = carRepository.findAllByModel(car.getMark());
        return foundCarsModel;
    }
    public List<Car> searchyear(Car car) {
        List<Car> foundCarsYear = carRepository.findAllByModel(car.getMark());
        return foundCarsYear;
    }

}
