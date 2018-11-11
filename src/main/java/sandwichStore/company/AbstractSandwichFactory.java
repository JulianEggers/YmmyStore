package sandwichStore.company;

import sandwichStore.sandwich.CheeseSandwich;
import sandwichStore.sandwich.Sandwich;
import sandwichStore.sandwich.StandardSandwich;
import sandwichStore.sandwich.VeganSandwich;
import sandwichStore.sandwich.ingredients.*;

public abstract class AbstractSandwichFactory {

    public enum Country {
        AMERICA, GREEK, FRANCE
    }

    private static final AmericanFactory americanFactory = new AmericanFactory();
    private static final GreekFactory greekFactory = new GreekFactory();
    private static final FranceFactory franceFactory = new FranceFactory();

    public static AbstractSandwichFactory newInstance(Country country) {
        switch (country) {
            case AMERICA:
                return americanFactory;
            case GREEK:
                return greekFactory;
            case FRANCE:
                return franceFactory;
            default:
                return null;
        }
    }

    public Sandwich makeSandwich(Sandwich.Type type) {
        Sandwich sandwich = null;
        switch (type) {
            case STANDARD:
                sandwich = new StandardSandwich(getLocalBread(), getLocalCheese(), getLocalSalami(), getLocalDressing());
                break;
            case CHEESE:
                sandwich = new CheeseSandwich(getLocalBread(), getLocalLettuce(), getLocalDressing());
                break;
            case VEGAN:
                sandwich = new VeganSandwich(getLocalBread(), getLocalLettuce(), getLocalDressing());
                break;
        }
        return sandwich;
    }

    abstract Bread getLocalBread();

    abstract Dressing getLocalDressing();

    abstract Cheese getLocalCheese();

    abstract Lettuce getLocalLettuce();

    abstract Salami getLocalSalami();
}
