package com.training.firstData.dao;

import com.training.firstData.model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
public class CarDao {
    @Autowired
    private CarRepository carRepository;

    public Collection<Cars> getCars() {
        return carRepository.findAll();
    }

    public Cars insertCar(Cars cars){
        return carRepository.insert(cars);
    }

    public Optional<Cars> getID(String id) {
        return carRepository.findById(id);
    }

    public Optional<Cars> deleteCar(String id) {
        Optional<Cars> carID = carRepository.findById(id);
        carID.ifPresent(c -> carRepository.delete(c));
        return carID;
    }

    public Optional<Cars> updateCar(String id, Cars cars) {
        Optional<Cars> carID = carRepository.findById(id);
        carID.ifPresent(c -> c.setMarke(cars.getMarke()));
        carID.ifPresent(c -> c.setModell(cars.getModell()));
        carID.ifPresent(c -> c.setFarbe(cars.getFarbe()));
        carID.ifPresent(c -> c.setBaujahr(cars.getBaujahr()));
        carID.ifPresent(c -> c.setPs(cars.getPs()));
        carID.ifPresent(c -> carRepository.save(c));
        return carID;
    }
}
