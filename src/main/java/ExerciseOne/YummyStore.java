package ExerciseOne;

import ExerciseOne.Store.AbstractSandwichFactory;
import ExerciseOne.sandwich.Sandwich;

public class YummyStore {

    public Sandwich assembleSandwichOrder(AbstractSandwichFactory.Country country, Sandwich.Type type) {
        AbstractSandwichFactory factory = AbstractSandwichFactory.newInstance(country);
        return factory.makeSandwich(type);
    }

    public static void main(String[] args) {
        YummyStore yummyStore = new YummyStore();
        Sandwich sandwich = yummyStore.assembleSandwichOrder(AbstractSandwichFactory.Country.AMERICA, Sandwich.Type.CHEESE);
        System.out.println(sandwich.toString());
    }

}

