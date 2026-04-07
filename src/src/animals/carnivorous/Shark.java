package animals.carnivorous;

import animals.actions.Swim;
import animals.food.Food;
import animals.food.WrongFoodException;


public class Shark extends Carnivorous implements Swim {
    public Shark(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    @Override
    public void swim() {
      action(EnergyConsumption.SWIM);
    }
}
