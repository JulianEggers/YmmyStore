package sandwichStore.company;

import sandwichStore.sandwich.ingredients.Baguette;
import sandwichStore.sandwich.ingredients.Bread;
import sandwichStore.sandwich.ingredients.Brie;
import sandwichStore.sandwich.ingredients.Cheese;
import sandwichStore.sandwich.ingredients.Dressing;
import sandwichStore.sandwich.ingredients.FrenchDressing;
import sandwichStore.sandwich.ingredients.IcebergLettuce;
import sandwichStore.sandwich.ingredients.Lettuce;
import sandwichStore.sandwich.ingredients.PaprikaSalami;
import sandwichStore.sandwich.ingredients.Salami;

class FranceFactory extends AbstractSandwichFactory {

    @Override
    Bread getLocalBread() {
        return new Baguette();
    }

    @Override
    Dressing getLocalDressing() {
        return new FrenchDressing();
    }

    @Override
    Cheese getLocalCheese() {
        return new Brie();
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
