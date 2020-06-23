package com.training.firstData.service;

import com.training.firstData.dao.CarDao;
import com.training.firstData.model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarDao carDao;

    public Collection<Cars> getCars(){

        return carDao.getCars();
    }

    public Cars insertCar(Cars cars){

        return carDao.insertCar(cars);
    }

    public Optional<Cars> getID(String id) {

        return carDao.getID(id);
    }

    public Optional<Cars> deleteCar(String id) {

        return carDao.deleteCar(id);
    }

    public Optional<Cars> updateCar(String id, Cars cars) {

        return carDao.updateCar(id, cars);
    }
}
