package Lab.assignment.afterrefactoring;

public abstract class CoffeeMakerTemplate {

    public void PrepareCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        addFinalTouch();

    }
    protected abstract void addIngredients();

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    protected abstract void addFinalTouch();


}
