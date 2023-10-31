package br.com.pyetro.factory;

public class FactoryContract extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new CorolaCar(100, "full", "blue");
        } else {
            return null;
        }
    }
}
