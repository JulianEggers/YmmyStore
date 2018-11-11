package ExerciseOne.Store;

import ExerciseOne.sandwich.Sandwich;
import ExerciseOne.sandwich.StandardSandwich;
import ExerciseOne.sandwich.ingredients.Baguette;
import ExerciseOne.sandwich.ingredients.Bread;
import ExerciseOne.sandwich.ingredients.Brie;
import ExerciseOne.sandwich.ingredients.Cheese;
import ExerciseOne.sandwich.ingredients.Dressing;
import ExerciseOne.sandwich.ingredients.FrenchDressing;
import ExerciseOne.sandwich.ingredients.IcebergLettuce;
import ExerciseOne.sandwich.ingredients.Lettuce;
import ExerciseOne.sandwich.ingredients.PaprikaSalami;
import ExerciseOne.sandwich.ingredients.Salami;

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
