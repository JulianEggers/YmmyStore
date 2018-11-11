package sandwichStore.sandwich;

import sandwichStore.sandwich.ingredients.Bread;
import sandwichStore.sandwich.ingredients.Dressing;
import sandwichStore.sandwich.ingredients.Lettuce;

public class CheeseSandwich implements Sandwich {

    private final Bread bread;
    private final Lettuce lettuce;
    private final Dressing dressing;

    public CheeseSandwich(Bread bread, Lettuce lettuce, Dressing dressing) {
        this.bread = bread;
        this.lettuce = lettuce;
        this.dressing = dressing;
    }
}
