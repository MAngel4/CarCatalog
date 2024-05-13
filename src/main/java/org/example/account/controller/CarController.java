package org.example.account.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.account.model.Car;
import org.example.account.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CarController {
    private final CarService carService;

    @PostMapping("/car/create")
    public Car createcar(@RequestBody Car car) {

        return carService.CreateCar(car);
    }

    @DeleteMapping("/car/delete/{id}")
    public Car deletecar(@PathVariable long id) {
        return carService.DeleteCar(id);
    }
    @PutMapping("car/update/{id}")
    public Car update(@PathVariable Long id,@RequestBody Car car){
        return carService.UpdateCar(id,car);
    }
    @GetMapping("/car/get/{id}")
    public Car getCar(@PathVariable long id){
        return  carService.getCar(id);
    }
    @PostMapping("car/search/mark")
    public List<Car> searchmark(@RequestBody Car car)
    {
        return  carService.searchmark(car);
    }
    @PostMapping("car/search/model")
    public List<Car> searchmodel(@RequestBody Car car)
    {
        return  carService.searchmodel(car);
    }
    @PostMapping("car/search/year")
    public List<Car> searchyear(@RequestBody Car car)
    {
        return  carService.searchyear(car);
    }

}
