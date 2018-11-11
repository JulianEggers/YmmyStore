package sandwichStore.sandwich;

import sandwichStore.sandwich.ingredients.Bread;
import sandwichStore.sandwich.ingredients.Cheese;
import sandwichStore.sandwich.ingredients.Dressing;
import sandwichStore.sandwich.ingredients.Salami;

public class StandardSandwich implements Sandwich {

    private final Bread bread;
    private final Cheese cheese;
    private final Salami salami;
    private final Dressing dressing;

    public StandardSandwich(Bread bread, Cheese cheese, Salami salami, Dressing dressing) {
        this.bread = bread;
        this.cheese = cheese;
        this.salami = salami;
        this.dressing = dressing;
    }

}
