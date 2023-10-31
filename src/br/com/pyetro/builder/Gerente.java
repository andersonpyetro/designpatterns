package br.com.pyetro.builder;

public class Gerente {

    BurgerBuilder builder;

    public BurgerBuilder getBuilder(){
        return builder;
    }

    public void setBuilder(BurgerBuilder builder){
        this.builder = builder;
    }

    public Burger buildBurger(){
        builder.buildBun();
        builder.buildMeat();
        builder.buildSalad();
        builder.buildCheese();
        builder.buildSauce();
        return builder.build();
    }
}
