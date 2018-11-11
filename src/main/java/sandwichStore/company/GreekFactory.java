package sandwichStore.company;

import sandwichStore.sandwich.ingredients.*;

class GreekFactory extends AbstractSandwichFactory {


    @Override
    Bread getLocalBread() {
        return new Olivenbrot();
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
