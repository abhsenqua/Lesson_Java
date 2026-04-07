package animals.herbivore;

import animals.Animals;
import animals.actions.Swim;
import animals.actions.Voice;
import animals.carnivorous.EnergyConsumption;
import animals.food.Food;
import animals.food.WrongFoodException;

public class Duck extends Herbivore implements Swim, Voice {
    public Duck(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    @Override
    public void swim() {
        action(EnergyConsumption.SWIM);
    }

    @Override
    public void voice() {
        action(EnergyConsumption.VOICE);
    }
}
