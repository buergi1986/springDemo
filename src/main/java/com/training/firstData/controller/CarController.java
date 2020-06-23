package com.training.firstData.controller;

import com.training.firstData.model.Cars;
import com.training.firstData.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public Collection<Cars> getCars(){
        return carService.getCars();
    }

    @GetMapping("/{id}")
    public Optional<Cars> getID(@PathVariable("id") String id){
        return carService.getID(id);
    }

    @PostMapping
    public Cars insertCar(@RequestBody Cars cars){
        return carService.insertCar(cars);
    }

    @PutMapping("/update/{id}")
    public Optional<Cars> updateCar(@PathVariable("id") String id, @RequestBody Cars cars){
        return carService.updateCar(id, cars);
    }

    @DeleteMapping("/delete/{id}")
    public Optional<Cars> deleteCar(@PathVariable("id") String id){
        return carService.deleteCar(id);
    }
}
