package br.com.pyetro.factory;

public abstract class Factory {

    public Car create(String requestedGrade){
        Car car = retrieveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car){
        car.mechanicCheck();
        car.fuelCar();
        car.Clean();
        return car;
    }

    abstract Car retrieveCar(String requestedGrade);
}
