package ExerciseOne.Store;

import ExerciseOne.sandwich.Sandwich;
import ExerciseOne.sandwich.ingredients.*;

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
