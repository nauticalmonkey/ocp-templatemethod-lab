package Lab.assignment.afterrefactoring;

public class MochaCoffee extends CoffeeMakerTemplate {


    public void PrepareCoffee(){
        super.PrepareCoffee();

    }
    @Override
    protected void addIngredients(){
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected void addFinalTouch(){
        System.out.println("Adding sugar");
    }
}
