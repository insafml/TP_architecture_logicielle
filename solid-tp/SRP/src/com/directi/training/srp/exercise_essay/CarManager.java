package com.directi.training.srp.exercise_refactored;

public class CarManager
{
    private final CarDB _carDB;
    private final CarNames _carNames;
    private final CarBest _carBest;

    public CarManager(CarDB carDB, CarNames carNames, CarBest carBest)
    {
        _carDB = carDB;
        _carNames = carNames;
        _carBest = carBest;
    }

    public Car getCarById(final String carId)
    {
        return _carDB.getFromDB(carId);
    }

    public String getCarsNames()
    {
        return _carNames.getCarsNames(_carDB.findAll());
    }

    public Car getBestCar()
    {
        return _carBest.getBestCar(_carDB.findAll());
    }
}
