package br.com.pyetro.builder;

public class Demo {

    public static void main (String[] args){
        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger burger = gerente.buildBurger();
        burger.print();

        gerente.setBuilder(new VeganBurgerBuilder());
        Burger burger1 = gerente.buildBurger();
        burger1.print();
    }
}
