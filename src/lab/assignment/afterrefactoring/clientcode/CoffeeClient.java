package Lab.assignment.afterrefactoring.clientcode;
import Lab.assignment.afterrefactoring.Americano;
import Lab.assignment.afterrefactoring.CappuccinoCoffee;
import Lab.assignment.afterrefactoring.CoffeeMakerTemplate;
import Lab.assignment.afterrefactoring.MochaCoffee;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMakerTemplate starbuzz = new MochaCoffee();
        starbuzz.PrepareCoffee();
        CoffeeMakerTemplate Gringots = new CappuccinoCoffee();
        CoffeeMakerTemplate Italy = new Americano();

        System.out.println("********************");

        Gringots.PrepareCoffee();

        System.out.println("**********************");
        Italy.PrepareCoffee();

    }


}

