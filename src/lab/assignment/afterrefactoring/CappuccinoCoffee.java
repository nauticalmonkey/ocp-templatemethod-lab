package Lab.assignment.afterrefactoring;

public class CappuccinoCoffee extends CoffeeMakerTemplate {

    public void PrepareCoffee(){
        super.PrepareCoffee();

    }
    @Override
    protected void addIngredients(){
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }

    @Override
    protected void addFinalTouch(){
        System.out.println("Top with milk foam");
    }


}