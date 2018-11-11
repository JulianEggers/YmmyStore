package ExerciseOne.Store;

import ExerciseOne.sandwich.ingredients.AmericanDressing;
import ExerciseOne.sandwich.ingredients.Bread;
import ExerciseOne.sandwich.ingredients.Cheddar;
import ExerciseOne.sandwich.ingredients.Cheese;
import ExerciseOne.sandwich.ingredients.Dressing;
import ExerciseOne.sandwich.ingredients.IcebergLettuce;
import ExerciseOne.sandwich.ingredients.Lettuce;
import ExerciseOne.sandwich.ingredients.PaprikaSalami;
import ExerciseOne.sandwich.ingredients.Salami;
import ExerciseOne.sandwich.ingredients.WhiteBread;

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
