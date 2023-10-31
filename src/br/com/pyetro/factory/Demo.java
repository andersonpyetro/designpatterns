package br.com.pyetro.factory;

public class Demo {
    public static void main(String[] args){
        Customer client = new Customer("A", false);
        Factory factory = getFactory(client);
        Car car = factory.create(client.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer client){
        if (client.isHasCompanyContract()){
            return new FactoryContract();
        } else {
            return new NoContractFactory();
        }
    }

}
