package br.com.pyetro.factory;

public class NoContractFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)){
            return new Mercedes(100,"full","red");
        } else {
            return null;
        }
    }
}
