package Lab.assignment.beforerefactoring.clientcode;

import Lab.assignment.beforerefactoring.CoffeeMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new CoffeeMaker();
        starbuzz.prepareMochaCoffee();

        System.out.println("********************");

        starbuzz.prepareCapuccinoCoffee();

    }

}
