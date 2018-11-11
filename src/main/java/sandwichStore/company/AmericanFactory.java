package sandwichStore.company;

import sandwichStore.sandwich.ingredients.AmericanDressing;
import sandwichStore.sandwich.ingredients.Bread;
import sandwichStore.sandwich.ingredients.Cheddar;
import sandwichStore.sandwich.ingredients.Cheese;
import sandwichStore.sandwich.ingredients.Dressing;
import sandwichStore.sandwich.ingredients.IcebergLettuce;
import sandwichStore.sandwich.ingredients.Lettuce;
import sandwichStore.sandwich.ingredients.PaprikaSalami;
import sandwichStore.sandwich.ingredients.Salami;
import sandwichStore.sandwich.ingredients.WhiteBread;

class AmericanFactory extends AbstractSandwichFactory {

    @Override
    Bread getLocalBread() {
        return new WhiteBread();
    }

    @Override
    Dressing getLocalDressing() {
        return new AmericanDressing();
    }

    @Override
    Cheese getLocalCheese() {
        return new Cheddar();
    }

    @Override
    Lettuce getLocalLettuce() {
        return new IcebergLettuce();
    }

    @Override
    Salami getLocalSalami() {
        return new PaprikaSalami();
    }
}
