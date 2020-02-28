package Lab.assignment.afterrefactoring;

public class Americano extends CoffeeMakerTemplate {

    public void PrepareCoffee(){
        super.PrepareCoffee();

    }

    @Override
    protected void addIngredients() {
        System.out.println("Add More Hot Water");

    }

    @Override
    protected void addFinalTouch() {
        System.out.println("Add sugar and cream");

    }
}
